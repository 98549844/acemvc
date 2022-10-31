package com.util;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class MapUtil {
    private static final Logger log = LogManager.getLogger(MapUtil.class.getName());


    /**
     * 历遍所有map元素
     *
     * @param map
     */
    public static void iterateMapKeySet(Map map) {
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Key: " + key.toString() + "   " + "value: " + val.toString());
        }
        System.out.println("The Map size is : " + map.size());
        System.out.println("keyset : " + map.keySet());
    }


}
