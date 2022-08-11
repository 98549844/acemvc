package com.controller;

import com.entity.UserProfile;
import com.entity.Users;
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

    @Autowired
    public IndexController(UsersService usersService) {
        this.usersService = usersService;

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
            System.out.println("MPFA USER:   "+users.get(i).getEnglishFirstName());
        }

        return users;
    }
}

