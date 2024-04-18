package org.example.designPatterns.abstractFactory;

public class NorthAmericaSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}
