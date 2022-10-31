package com.controller;

import com.util.JndiMailUtil;
import com.util.QQMailUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Classname: MailController
 * @Date: 2022/10/31 上午 09:37
 * @Author: kalam_au
 * @Description:
 */

@Controller
public class MailController {
    private static final Logger log = LogManager.getLogger(MailController.class.getName());

    @RequestMapping(value = "/mail/send", method = RequestMethod.GET)
    public void sendMail() {
        String to = "garlam_au@qq.com";
        String cc = "";
        String bcc = "";
        String title = "Send from idea ace project";
        String content = "Direct config to send QQMail !!!";
        QQMailUtil.sendEmil(to, cc, bcc, title, content);
        System.out.println("Mail sent success !!!");
    }

    @RequestMapping(value = "/tomcat/mail/send", method = RequestMethod.GET)
    public void sendTomcatMail() {
        String from = "87548744@qq.com";
        String to = "garlam_au@qq.com";
        String cc = "";
        String bcc = "";
        String title = "Send from idea ace project";
        String content = "Get tomcat resource to send QQMail !!!";
        try {
            JndiMailUtil.send(to, cc, bcc, title, content);
            System.out.println("Mail sent success !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

