package com.izyumka.lesson2;

public class Main {
    public static Calc calc2;
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc2 = new Calc();
        Calc calc3 = new Calc(80, 100);
        System.out.println(Calc.add(3, 2));
        System.out.println(calc.odd(4,3));
        System.out.println(calc.mult(3,4));
        System.out.println(calc.div(4, 2));
        System.out.println((calc.sqrt(16)));
        System.out.println(calc.sqrt(4));
        System.out.println(calc);
        System.out.println(calc2);
        System.out.println(calc3.accurancy);
        System.out.println(calc3.chargelevel);
    }
}
