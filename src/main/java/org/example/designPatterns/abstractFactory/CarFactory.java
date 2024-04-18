package org.example.designPatterns.abstractFactory;

public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
