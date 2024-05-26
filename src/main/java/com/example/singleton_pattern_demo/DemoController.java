package com.example.singleton_pattern_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Injetar a instância única do Singleton
    private SingletonDemo singletonDemo = SingletonDemo.getInstance();

    @GetMapping("/")
    public String home() {
        // Usar a instância do Singleton para mostrar uma mensagem
        singletonDemo.showMessage();
        return "Check the console for the message!";
    }
}