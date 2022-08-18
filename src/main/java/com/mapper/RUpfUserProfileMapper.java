package com.mapper;

import com.entity.RUpfUserProfile;
import com.entity.RUpfUserProfileExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RUpfUserProfileMapper {
    long countByExample(RUpfUserProfileExample example);

    int deleteByExample(RUpfUserProfileExample example);

    int deleteByPrimaryKey(String upfUserId);

    int insert(RUpfUserProfile row);

    int insertSelective(RUpfUserProfile row);

    List<RUpfUserProfile> selectByExample(RUpfUserProfileExample example);

    List<RUpfUserProfile> selectAll();

    RUpfUserProfile selectByPrimaryKey(String upfUserId);

    int updateByExampleSelective(@Param("row") RUpfUserProfile row, @Param("example") RUpfUserProfileExample example);

    int updateByExample(@Param("row") RUpfUserProfile row, @Param("example") RUpfUserProfileExample example);

    int updateByPrimaryKeySelective(RUpfUserProfile row);

    int updateByPrimaryKey(RUpfUserProfile row);
}