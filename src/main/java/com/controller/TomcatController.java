package com.controller;

import com.util.TomcatResourceUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.naming.NamingException;

/**
 * @Classname: TomcatController
 * @Date: 2022/10/31 下午 02:45
 * @Author: kalam_au
 * @Description:
 */

@Controller
public class TomcatController {
    private static final Logger log = LogManager.getLogger(TomcatController.class.getName());

    @GetMapping(value = "/tomcat/get")
    public void getTomcatInfo() throws NamingException {
        TomcatResourceUtil.getTomcatInfo();
    }

}

