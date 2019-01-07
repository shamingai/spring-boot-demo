package cn.zt.springboot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Desciption: Spring推荐这种配置，注解就可以XML，而且除了添加注解以外，与其他没有什么不同
 * @Author: zhaotong
 * @Date: 2019/1/3 12:18 PM
 */
public class Main {

    public static void main(String[] args) {

        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 在 Spring 容器中获取 Bean 对象 SpringConfig 中设置的扫码包，UserService 里添加 @Service 注解
        UserService userService = context.getBean(UserService.class);

        // 调用对象中的方法
        List<User> list = userService.queryUserList();
        for (User user : list) {
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPassword());
        }

        // 销毁该容器
        context.destroy();

    }

}
