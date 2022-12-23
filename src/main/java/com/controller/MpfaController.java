package com.controller;

import com.entity.RFncFunction;
import com.entity.RFncFunctionKey;
import com.entity.RUpfUserProfile;
import com.entity.UserProfile;
import com.service.RFncFunctionService;
import com.service.RUpfUserProfileService;
import com.service.UsersService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Classname: MpfaController
 * @Date: 2022/12/23 上午 11:08
 * @Author: kalam_au
 * @Description:
 */

//@Controller
public class MpfaController {
    private static final Logger log = LogManager.getLogger(MpfaController.class.getName());

    private final RFncFunctionService rFncFunctionService;
    private final RUpfUserProfileService upfUserProfileService;
    private final UsersService usersService;


    //@Autowired
    public MpfaController(UsersService usersService, RFncFunctionService rFncFunctionService, RUpfUserProfileService upfUserProfileService) {
        this.rFncFunctionService = rFncFunctionService;
        this.upfUserProfileService = upfUserProfileService;
        this.usersService = usersService;

    }


    @RequestMapping(method = RequestMethod.GET, value = "/mybatis/getAllProfile")
    public List<RUpfUserProfile> getAllProfile() {
        List<RUpfUserProfile> profiles = upfUserProfileService.selectAll();
        for (int i = 0; i < profiles.size(); i++) {
            System.out.println("USER profiles:   " + profiles.get(i).getUpfEngName());
        }
        return profiles;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/mybatis/getAllRfn")
    public List<RFncFunction> getAllRfn() {
        try {
            List<RFncFunction> ls = rFncFunctionService.findAll();
            for (int i = 0; i < ls.size(); i++) {
                System.out.println(ls.get(i).getFncDesc());
            }
            return ls;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/mybatis/getRfn")
    public RFncFunction getRfn() {

        RFncFunctionKey key = new RFncFunctionKey();
        key.setFncApplId("ACE2DEMO");
        key.setFncParentFuncId("ACE2DEMO");
        key.setFncFuncId("RANK");

        try {
            RFncFunction rFncFunction = rFncFunctionService.findByKey(key);
            System.out.println(rFncFunction.getFncDesc());
            return rFncFunction;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/mybatis/getMpfaUsers")
    public List<UserProfile> getAllMpfaUsers() {
        List<UserProfile> users = usersService.findAllMpfaDemoUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println("MPFA USER:   " + users.get(i).getEnglishFirstName());
        }

        return users;
    }
}

