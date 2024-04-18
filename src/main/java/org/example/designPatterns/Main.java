package org.example.designPatterns;

import org.example.designPatterns.abstractFactory.*;
import org.example.designPatterns.builder.Person;
import org.example.designPatterns.factory.ComputerFactory;
import org.example.designPatterns.factory.PhoneFactory;
import org.example.designPatterns.factory.Product;
import org.example.designPatterns.prototype.Letter;
import org.example.designPatterns.prototype.Report;
import org.example.designPatterns.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Product phone = phoneFactory.createProduct();
        phone.buy();
        ComputerFactory computerFactory = new ComputerFactory();
        Product computer = computerFactory.createProduct();
        computer.buy();
        //abstract Factory design pattern
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();
        northAmericaCar.assemble();
        northAmericaSpec.display();
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();
        europeCar.assemble();
        europeSpec.display();
        // builder design pattern
        Person.Builder personBuilder = new Person.Builder();
        Person person1 = personBuilder.firstName("Joey").lastName("Boomer").build();
        Person person2 = personBuilder.firstName("Jean").address("californoia").build();
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        // singleton design pattern
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.equals(s2)); // return true when comparing objects contents
        System.out.println(s1 == s2);     // return true when comparing  objects references
        // prototype design pattern
        Letter letter1 = new Letter("Sample content", "John Doe", "Jane Smith");
        Letter letter2 = new Letter("Sample content", "John Doe", "Jane Smith");
        Report report1 = new Report("Sample content", "Alice Johnson", "Quarterly Report");
        System.out.println(letter1.equals(letter2)); // return true when comparing objects contents
        System.out.println(letter1 == letter2);  // return false when comparing objects references
        Letter letter = letter1.clone();
        letter.setRecipient("Jean Michel");
        Report report = report1.clone();
        report.setAuthor("Herbert Schildt");
        report.setTitle("The Complete Reference");
        System.out.println("New Letter: Type=" + letter.getType() + ", Sender=" + letter.getSender() + ", Recipient=" + letter.getRecipient() + ", Content=" + letter.getContent());
        System.out.println("New Report: Type=" + report.getType() + ", Author=" + report.getAuthor() + ", Title=" + report.getTitle() + ", Content=" + report.getContent());

    }
}
