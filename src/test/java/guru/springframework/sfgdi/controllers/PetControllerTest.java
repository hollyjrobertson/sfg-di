package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.CatGreetingService;
import guru.springframework.sfgdi.services.DogGreetingService;
import guru.springframework.sfgdi.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetControllerTest {
    @Test
    void sayHello() {
        PetController dogController = new PetController(new DogGreetingService());
        PetController catController = new PetController(new CatGreetingService());

        assertEquals("Hello from Gizmo", dogController.sayHello());
        assertEquals("Hello from Bishop", catController.sayHello());
    }

}