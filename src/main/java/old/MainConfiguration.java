package old;

import old.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("old")
@Scope("prototype")
public class MainConfiguration {

    @Autowired
    @Qualifier("main")
    GreetingService greetingService;
}

