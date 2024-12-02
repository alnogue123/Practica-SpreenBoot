package curso_springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {
    @GetMapping("/Saludo/{name}")
    public String Greeting(@PathVariable String name) {
        return "Hola " + name;
    }
}