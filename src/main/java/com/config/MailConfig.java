package com.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * @Classname: MailConfig
 * @Date: 2022/10/31 上午 10:12
 * @Author: kalam_au
 * @Description:
 */


public class MailConfig {
    private static final Logger log = LogManager.getLogger(MailConfig.class.getName());

    public static void mailConfig(String to, String cc, String bcc, String title, String content) throws NamingException, MessagingException {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        Session session = (Session) envCtx.lookup("mail/mpfa");

        Properties props = getMailProperties(session);

        String from = session.getProperty("mail.smtp.user");
        String password = session.getProperty("mail.smtp.password");
        log.info("mail.smtp.user: " + from);
        log.info("mail.smtp.password: " + password);

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };
        Session ses = Session.getDefaultInstance(props, auth);

        Message message = new MimeMessage(ses);
        message.setFrom(new InternetAddress(from));
        InternetAddress receiver[] = new InternetAddress[1];
        receiver[0] = new InternetAddress(to);
        message.setRecipients(Message.RecipientType.TO, receiver);
        message.setSubject(title);
        message.setContent(content, "text/plain");
        Transport.send(message);
    }

    private static Properties getMailProperties(Session session) {
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        Properties props = new Properties();
        String name = session.getProperty("name");
        String type = session.getProperty("type");
        String host = session.getProperty("mail.smtp.host");
        String port = session.getProperty("mail.smtp.port");
        String auth = session.getProperty("auth");


        log.info("name: " + name);
        log.info("auth: " + auth);
        log.info("type: " + type);
        log.info("mail.smtp.host: " + host);
        log.info("mail.smtp.port: " + port);
        log.info("mail.smtp.auth: " + session.getProperty("mail.smtp.auth"));

        log.info("mail.smtp.starttls.enable: " + session.getProperty("mail.smtp.starttls.enable"));

        //邮箱的发送服务器地址
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.host", host);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        //邮箱发送服务器端口,这里设置为465端口
        props.setProperty("mail.smtp.port", port);
        props.setProperty("mail.smtp.socketFactory.port", port);
        props.put("mail.smtp.auth", auth);
        return props;
    }

}

