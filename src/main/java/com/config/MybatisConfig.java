//package com.config;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
///**
// * @Classname: MybatisConfig
// * @Date: 2022/8/8 上午 10:54
// * @Author: kalam_au
// * @Description:
// */
//
//@Configuration
//@MapperScan(basePackages = {"com.dao"})
//public class MybatisConfig {
//    private static final Logger log = LogManager.getLogger(MybatisConfig.class.getName());
//
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(sqlSessionFactory());
//    }
//
//    //数据源
//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        druidDataSource.setUrl("jdbc:mysql://localhost:3306/clyu");
//        druidDataSource.setUsername("root");
//        druidDataSource.setPassword("YCLh2o2@");
//        return druidDataSource;
//    }
//
//    //使用 SqlSessionFactoryBean来创建 SqlSessionFactory。并配置这个工厂bean
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        factoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
//        //
//        factoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
//        return factoryBean.getObject();
//    }
//
//    //事物支持
//    //如果想要开启事务还要使用@EnableTransactionManagement注解
//    @Bean
//    public DataSourceTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }
//
//}
//
