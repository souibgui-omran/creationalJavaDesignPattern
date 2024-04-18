package org.example.designPatterns.factory;

public class Phone implements Product{
    @Override
    public void buy() {
        System.out.println("phone product ...");
    }
}
