package com.izyumka.lesson2;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(Calc.add(3, 2));
        System.out.println(calc.odd(4,3));
        System.out.println(calc.mult(3,4));
        System.out.println(calc.div(4, 2));
        System.out.println((calc.sqrt(16)));
    }
}
