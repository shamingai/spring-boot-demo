package Application.HelloSpringBoot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * 启动方式1/2 本页main方法启动--不常用
     * http://127.0.0.1:8080/hello
     * @param args
     */
    public static void main(String[] args) {
//        SpringApplication.run(HelloSpringBootController.class, args);
        SpringApplication application = new SpringApplication(HelloSpringBootController.class);
        application.setBannerMode(Banner.Mode.OFF); // 关闭banner
        application.run(args);
    }
}
