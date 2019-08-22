package cn.lei.dockertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ElasticsearchApplication
 */
@SpringBootApplication(scanBasePackages = {"cn.lei"})
@EnableFeignClients(basePackages = {"cn.lei"})
@MapperScan("cn.lei.dockertest.dao")
public class DockertestApplication {

    /**
     * main
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(DockertestApplication.class, args);
    }

    /**
     * 没什么用，就是不想让checkstyle报错
     */
    public void init() {
    }
}

