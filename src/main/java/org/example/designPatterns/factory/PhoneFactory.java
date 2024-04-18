package org.example.designPatterns.factory;

public class PhoneFactory implements FactoryProductInterface{
    @Override
    public Product createProduct() {
        return new Phone();
    }
}
