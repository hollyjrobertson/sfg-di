package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;

@Primary
public interface GreetingService {
    public String sayGreeting();
}
