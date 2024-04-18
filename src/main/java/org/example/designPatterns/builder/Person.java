package org.example.designPatterns.builder;

public class Person {

    private final String firstName;
    private final String lastName;
    private final String feedback;
    private final String phoneNumber;
    private final String address;


    public Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.feedback = builder.feedback;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String feedback;
        private String phoneNumber;
        private String address;

        public Person build(){
            return new Person(this);
        }

        public Builder(){ }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder feedback(String feedback){
            this.feedback = feedback;
            return this;
        }

        public Builder phoneNumber(String  phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", feedback='" + feedback + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}