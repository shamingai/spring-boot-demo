package cn.zt.springboot.javaconfig;

import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2019/1/3 12:14 PM
 */
@Configuration //通过该注解来表明该类是一个Spring的配置类，相当于一个xml文件
@ComponentScan(basePackages = "cn.zt.springboot.javaconfig") //配置扫描包
@PropertySource(value= {"classpath:jdbc.properties", "xxx"}, ignoreResourceNotFound = true) // 可配置多个文件，文件不存在时忽略
public class SpringConfig {

    @Bean // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public UserDAO getUserDAO(){
        return new UserDAO(); // 直接new对象做演示，相当于向Spring中注入了一个叫UserDAO的xml文件
    }

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Bean(destroyMethod = "close")
    public BoneCPDataSource getBoneCPDataSource(){
        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
        boneCPDataSource.setDriverClass(driverClassName);
        return boneCPDataSource;
    }
}