package curso_springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordRestController {

    @GetMapping({"/Hello", "/hw", "/hola"})
    public String HelloWord(){
        System.out.println("Solicitud ejecutada");
        return "Hello, word!";
    }

}
