package old;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Qualifier("main")
public class GreetingService {

    public String sayGreeting() {
        return "Greeting, user!";
    }
}