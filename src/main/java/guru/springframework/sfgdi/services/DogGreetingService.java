package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Dog")
@Service("petService")
public class DogGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Gizmo";
    }
}
