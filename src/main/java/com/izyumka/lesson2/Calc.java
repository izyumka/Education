package com.izyumka.lesson2;

public class Calc {
    private int chargelevel;
    private int accurancy;

    public Calc() {
    }

    public Calc(int chargelevel, int accurancy) {
        this.chargelevel = chargelevel;
        this.accurancy = accurancy;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int odd(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public int getChargelevel() {
        return chargelevel;
    }

    public void setChargelevel(int chargelevel) {
        this.chargelevel = chargelevel;
    }

    public int getAccurancy() {
        return accurancy;
    }

    public void setAccurancy(int accurancy) {
        this.accurancy = accurancy;
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }
}

