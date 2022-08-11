package com.mapper;

import com.entity.UserProfile;

import java.util.List;

/**
 * @Classname: UserProfileDAO
 * @Date: 2022/8/10 下午 03:55
 * @Author: kalam_au
 * @Description:
 */
public interface UserProfileDAO {
    int deleteByPrimaryKey(String id);

    int insert(UserProfile row);

    UserProfile selectByPrimaryKey(String id);

    List<UserProfile> selectAll();

    int updateByPrimaryKey(UserProfile row);
}
