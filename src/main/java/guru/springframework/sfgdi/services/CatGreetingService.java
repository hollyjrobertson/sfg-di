package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Cat")
@Service("petService")
public class CatGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from Bishop";
    }
}
