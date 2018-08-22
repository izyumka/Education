package com.izyumka.training;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Person {
    private int age;
    private String name;
    private String lastname;
    private String patronomic;

    public Person(int age, String name, String lastname, String patronomic) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        this.patronomic = patronomic;

    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public void myName() {
        System.out.println("My name is " + lastname + " " + name + " " + patronomic);

    }

    public void naAge() {
        System.out.println("A am" + " " + age + " " + "age" + " " + "old");
    }
}


