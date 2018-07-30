package com.izyumka.lesson3;

public class Main {
    public static void main(String[] args) {
        Point point11 = new Point(1,5);
        Point point12 = new Point(4,8);
        Point point13 = new Point(6,-1);


        Triangle triangle = new Triangle(point11,point12,point13);
        System.out.println(triangle.perimetr());

    }
}
