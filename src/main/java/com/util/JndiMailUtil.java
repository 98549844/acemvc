package com.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @Classname: JndiMailUtil
 * @Date: 2022/10/31 下午 04:01
 * @Author: kalam_au
 * @Description:
 */


public class JndiMailUtil {
    private static final Logger log = LogManager.getLogger(JndiMailUtil.class.getName());

    public static void send(String to, String cc, String bcc, String title, String content) throws NamingException, MessagingException {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        Session session = (Session) envCtx.lookup("mail/mpfa");

        String from = session.getProperty("mail.smtp.user");
        String password = session.getProperty("password");
        log.info("mail.smtp.user: " + from);
        log.info("password: " + password);

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        InternetAddress receiver[] = new InternetAddress[1];
        receiver[0] = new InternetAddress(to);
        message.setRecipients(Message.RecipientType.TO, receiver);
        message.setSubject(title);
        message.setContent(content, "text/plain");
        Transport.send(message);
    }

}

