package com.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

public class BeanUtil {
    private static final Logger log = LogManager.getLogger(BeanUtil.class.getName());

    private static ApplicationContext applicationContext;

    /**
     * print all bean name
     */
    public static void printBeanNameByContextLoader() {
        ApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
        BeanUtil.applicationContext = context;
        String[] beanNames = BeanUtil.applicationContext.getBeanDefinitionNames();
        log.info("total bean: {}", BeanUtil.applicationContext.getBeanDefinitionCount());
        int i = 0;
        for (String s : beanNames) {
            log.info("{},beanName: {}", ++i, s);
        }
    }

    /**
     * getBean By beanName
     *
     * @param name
     * @return
     */
    public Object getBeanByName(String name) {
        Object object = applicationContext.getBean(name);
        return object;
    }

}
