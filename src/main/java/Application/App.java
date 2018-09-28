package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动方式2/2 可启用同层次的包，默认扫描启用同层次的包
 * http://127.0.0.1:8080/hello
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

/**
 * SpringBoot默认扫描静态文件：
 * 配置：默认扫描 applicatin.properties
 * 静态文件：默认扫描 resources/static 下的文件 js\css\image
 */