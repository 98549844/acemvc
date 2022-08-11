package com;

import com.util.VersionUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Classname: Acemvc
 * @Date: 2022/8/9 上午 09:44
 * @Author: kalam_au
 * @Description:
 */


public class Acemvc {
    private static final Logger log = LogManager.getLogger(Acemvc.class.getName());

    public static void main(String[] args) {
        VersionUtil.printSpringFrameworkVersion();
    }

}

