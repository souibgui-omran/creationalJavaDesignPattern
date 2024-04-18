package org.example.designPatterns.abstractFactory;

public class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }
}
