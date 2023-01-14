package com.wildevp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("spring.config.on-not-found", "ignore");
        //SpringApplication.run(Application.class, args);
        SpringApplication application = new SpringApplication(Application.class);
        application.setDefaultProperties(properties);
        application.run(args);
    }

}
