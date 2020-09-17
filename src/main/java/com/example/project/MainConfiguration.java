package com.example.project;

import com.example.project.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.example.project.services")
@Scope("prototype")
public class MainConfiguration {

    @Autowired
    @Qualifier("main")
    GreetingService greetingService;
}

