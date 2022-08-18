package com.mapper;

import com.entity.RFncFunction;
import com.entity.RFncFunctionExample;
import com.entity.RFncFunctionKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RFncFunctionMapper {
    long countByExample(RFncFunctionExample example);

    int deleteByExample(RFncFunctionExample example);

    int deleteByPrimaryKey(RFncFunctionKey key);

    int insert(RFncFunction row);

    int insertSelective(RFncFunction row);

    List<RFncFunction> selectByExample(RFncFunctionExample example);

    RFncFunction selectByPrimaryKey(RFncFunctionKey key);
    List<RFncFunction> selectAll();

    int updateByExampleSelective(@Param("row") RFncFunction row, @Param("example") RFncFunctionExample example);

    int updateByExample(@Param("row") RFncFunction row, @Param("example") RFncFunctionExample example);

    int updateByPrimaryKeySelective(RFncFunction row);

    int updateByPrimaryKey(RFncFunction row);
}