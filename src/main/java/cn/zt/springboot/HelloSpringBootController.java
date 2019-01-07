package cn.zt.springboot;

import cn.zt.springboot.javaconfig.SpringConfig;
import cn.zt.springboot.javaconfig.User;
import cn.zt.springboot.javaconfig.UserService;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RestController 返回json格式的数据 = @Controller + @ResponseBody
 *
 */

@RestController
@EnableAutoConfiguration
public class HelloSpringBootController {

    @RequestMapping("hello")
    public String hell() {
        return "hello Spring Boot！！！";
    }

    @RequestMapping("config")
    public String conf() {
        String result = "";
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 在 Spring 容器中获取 Bean 对象 SpringConfig 中设置的扫码包，UserService 里添加 @Service 注解
        UserService userService = context.getBean(UserService.class);

        // 调用对象中的方法
        List<User> list = userService.queryUserList();
        for (User user : list) {
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPassword());
            result += user.getUsername() + ", " + user.getPassword() + ", " + user.getPassword();
        }

        // 销毁该容器
        context.destroy();
        return result;
    }

    /**
     * 启动方式1/2 本页main方法启动--不常用
     * http://127.0.0.1:8080/hello
     * yml 配置了端口及规范，新路径为：http://127.0.0.1:8088/hello.html
     * @param args
     */
    public static void main(String[] args) {
//        SpringApplication.run(HelloSpringBootController.class, args);
        SpringApplication application = new SpringApplication(HelloSpringBootController.class);
        application.setBannerMode(Banner.Mode.OFF); // 关闭banner
        application.run(args);
    }
}
