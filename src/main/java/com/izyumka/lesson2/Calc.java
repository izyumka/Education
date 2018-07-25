package com.izyumka.lesson2;

public  class Calc {
    public int chargelevel;
    public int accurancy;

    public Calc() {
    }

    public Calc(int chargelevel, int accurancy) {
        this.chargelevel = chargelevel;
        this.accurancy = accurancy;
    }

    public static int add(int a, int b)
    {
        return a + b;
    }

   public static int odd(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a*b;
    }

    public static double div (double a, double b) {
        return a/b;
    }
    public static double sqrt (double a) {
        return Math.sqrt(a);
    }
}

