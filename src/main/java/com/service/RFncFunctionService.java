package com.service;

import com.entity.RFncFunction;
import com.entity.RFncFunctionKey;
import com.mapper.RFncFunctionMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname: RFncFunctionService
 * @Date: 2022/8/18 上午 10:40
 * @Author: kalam_au
 * @Description:
 */



@Service
public class RFncFunctionService {
    private static final Logger log = LogManager.getLogger(RFncFunctionService.class.getName());


    private RFncFunctionMapper rFncFunctionMapper;

    @Autowired
    public RFncFunctionService(RFncFunctionMapper rFncFunctionMapper) {
        this.rFncFunctionMapper = rFncFunctionMapper;
    }

    public List<RFncFunction> findAll() {
        return rFncFunctionMapper.selectAll();
    }

    public RFncFunction findByKey(RFncFunctionKey key) {
        return rFncFunctionMapper.selectByPrimaryKey(key);
    }

}

