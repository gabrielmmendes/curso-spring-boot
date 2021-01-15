package br.com.gabrielmmendes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@RestController
public class VendasApplication {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}