package org.example.designPatterns.factory;

public class ComputerFactory implements FactoryProductInterface{
    @Override
    public Product createProduct() {
        return new Computer();
    }
}
