package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动方式2/2 可启用同层次的包，默认扫描启用同层次的包
 * http://127.0.0.1:8080/hello
 */
@SpringBootApplication // Spring Boot项目的核心注解，主要目的是开启自动配置，它其实是一个组合注解。
public class App { // Spring Boot的项目一般都会有*Application的入口类，入口类中会有main方法，这是一个标准的Java应用程序的入口方法。
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

/**
 * SpringBoot默认扫描静态文件：
 * 配置：默认扫描 applicatin.properties
 * 静态文件：默认扫描 resources/static 下的文件 js\css\image
 */