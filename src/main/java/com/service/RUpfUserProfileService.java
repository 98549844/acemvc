package com.service;

import com.entity.RUpfUserProfile;
import com.entity.RUpfUserProfileExample;
import com.mapper.RUpfUserProfileMapper;
import com.mapper.UsersMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname: RUpfUserProfileService
 * @Date: 2022/8/18 上午 11:48
 * @Author: kalam_au
 * @Description:
 */

@Service
public class RUpfUserProfileService {
    private static final Logger log = LogManager.getLogger(RUpfUserProfileService.class.getName());

    private RUpfUserProfileMapper rUpfUserProfileMapper;


    public RUpfUserProfileService(RUpfUserProfileMapper rUpfUserProfileMapper) {
        this.rUpfUserProfileMapper = rUpfUserProfileMapper;
    }

    public List<RUpfUserProfile> selectAll() {
        return rUpfUserProfileMapper.selectAll();

    }

    public RUpfUserProfile selectByPrimaryKey(String upfUserId) {
        return rUpfUserProfileMapper.selectByPrimaryKey(upfUserId);
    }


}

