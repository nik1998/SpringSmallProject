package com.example.project;

import com.example.project.services.GreetingService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {
    private static final Logger logger = LogManager.getLogger(Starter.class);
    public static void main(String[] args) {
        logger.info("Starting configuration...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        //context.register(MainConfiguration.class);
        //context.refresh();
        GreetingService greetingService = context.getBean(GreetingService.class);
        logger.info(greetingService.sayGreeting());  // "Greeting, user!"
    }
}
