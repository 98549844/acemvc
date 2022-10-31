//package com.config;
//
//import com.util.MapUtil;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Properties;
//
///**
// * @Classname: MailConfig
// * @Date: 2022/10/31 上午 10:12
// * @Author: kalam_au
// * @Description:
// */
//
//
//public class MailConfig {
//    private static final Logger log = LogManager.getLogger(MailConfig.class.getName());
//
//    public static void mailConfig(String to, String cc, String bcc, String title, String content) throws NamingException, MessagingException {
//        Context initCtx = new InitialContext();
//        Context envCtx = (Context) initCtx.lookup("java:comp/env");
//        Session session = (Session) envCtx.lookup("mail/mpfa");
//
//        String from = session.getProperty("mail.smtp.user");
//        String password = session.getProperty("password");
//        log.info("mail.smtp.user: " + from);
//        log.info("password: " + password);
//
//        Message message = new MimeMessage(session);
//        message.setFrom(new InternetAddress(from));
//        InternetAddress receiver[] = new InternetAddress[1];
//        receiver[0] = new InternetAddress(to);
//        message.setRecipients(Message.RecipientType.TO, receiver);
//        message.setSubject(title);
//        message.setContent(content, "text/plain");
//        Transport.send(message);
//    }
//
//    private static void printMailProperties(Session session) {
//        Properties props = session.getProperties();
//        MapUtil.iterateMapKeySet(props);
//    }
//
//
//}
//
