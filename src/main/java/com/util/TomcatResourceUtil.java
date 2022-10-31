package com.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.mail.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * @Classname: TomcatResourceUtil
 * @Date: 2022/10/31 下午 02:35
 * @Author: kalam_au
 * @Description:
 */


public class TomcatResourceUtil {
    private static final Logger log = LogManager.getLogger(TomcatResourceUtil.class.getName());

    public static void main(String[] args) throws NamingException {
        getTomcatInfo();
    }

    public static void getTomcatInfo() throws NamingException {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        Session mailSession = (Session) envCtx.lookup("mail/mpfa");
        getMailProperties(mailSession);
    }

    private static void getMailProperties(Session session) {
        Properties props = session.getProperties();
        MapUtil.iterateMapKeySet(props);
    }


}

