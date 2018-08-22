package com.izyumka.training;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(23);
        person.setLastname("Izyumov");
        person.setName("Evgeniy");
        person.setPatronomic("Aleksandrovich");
        person.myName();
        person.naAge();
    }

}

