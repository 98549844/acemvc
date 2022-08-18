package com.controller;

import com.entity.*;
import com.service.RFncFunctionService;
import com.service.RUpfUserProfileService;
import com.service.UsersService;
import com.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Classname: IndexController
 * @Date: 2022/8/5 下午 03:20
 * @Author: kalam_au
 * @Description:
 */

@Controller
public class IndexController {

    private UsersService usersService;
    private RFncFunctionService rFncFunctionService;

    private RUpfUserProfileService upfUserProfileService;

    @Autowired
    public IndexController(UsersService usersService, RFncFunctionService rFncFunctionService, RUpfUserProfileService upfUserProfileService) {
        this.usersService = usersService;
        this.rFncFunctionService = rFncFunctionService;
        this.upfUserProfileService = upfUserProfileService;
    }

    @RequestMapping(value = "/print", method = RequestMethod.GET)
    public void printBean() {
        BeanUtil.printBeanNameByContextLoader();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        System.out.println("Hello World ~~~");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("Hello World");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/mybatis/getAll")
    public List<Users> getAllByIdMybatis() {
        List<Users> ls = usersService.findAllByMybatis();
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i).getUserAccount());
        }
        return ls;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/mybatis/getMpfaUsers")
    public List<UserProfile> getAllMpfaUsers() {
        List<UserProfile> users = usersService.findAllMpfaDemoUsers();

        for (int i = 0; i < users.size(); i++) {
            System.out.println("MPFA USER:   " + users.get(i).getEnglishFirstName());
        }

        return users;
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


}

