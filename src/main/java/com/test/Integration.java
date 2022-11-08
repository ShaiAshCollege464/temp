package com.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableScheduling
public class Integration {
    public static boolean applicationStarted = false;
    public static long startTime;
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Integration.class, args);
        applicationStarted = true;
        startTime = System.currentTimeMillis();




    }
}