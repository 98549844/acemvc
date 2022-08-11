package com.service;

import com.entity.UserProfile;
import com.entity.Users;
import com.mapper.UserProfileDAO;
import com.mapper.UsersMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname: UsersService
 * @Date: 2022/8/8 上午 11:17
 * @Author: kalam_au
 * @Description:
 */

@Service
public class UsersService {
    private static final Logger log = LogManager.getLogger(UsersService.class.getName());

    private UsersMapper usersMapper;
    private UserProfileDAO userProfileDAO;

    @Autowired
    public UsersService(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }


    public List<Users> findAllByMybatis() {
        List<Users> usersList = usersMapper.findAll();
        return usersList;
    }


    public List<UserProfile> findAllMpfaDemoUsers() {
        List<UserProfile> usersList = userProfileDAO.selectAll();
        return usersList;
    }

}

