package org.example.designPatterns.factory;

public class Computer implements Product {
    @Override
    public void buy() {
        System.out.println("computer product ...");
    }
}
