package com.example.singleton_pattern_demo;

public class SingletonDemo {

    // Instância estática privada da classe
    private static SingletonDemo instance;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private SingletonDemo() {}

    // Método estático para obter a instância única da classe
    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    // Métodos da classe
    public void showMessage() {
        System.out.println("Hello from Singleton Pattern!");
    }
}
