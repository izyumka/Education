package com.izyumka.lesson1;

public class FirstProgram {
    public static byte b = (byte)129;
    public static short s = 100;
    public static long i = 10000000000000000L;
    public static long l = 10000;
    public static float f = 1.11f;
    public static double d = 1.1111;
    public static char c = '*';
    public static boolean a = true;

    //Переменные из домашнего задания 1
    //Это пример 1
    public static int chinaPopulation = 1360000000;
    public static int indiaPopulation = 1240000000;
    public static int total = chinaPopulation + indiaPopulation;
    public static byte b1 = 1;
    public static byte b2 = 2;
//    public static byte b3 = byte b1+b2
    //А это пример 2
    public static int i1 = 123456789;
    public static float f1 = i1;
    public static double d1 = i1;
    public static short s1 = (short) i1;

    //Ну а теперь займемся примером 3
    public static int x = 1;
    public static int y = 0;
//    public static int z = x/y;

    //Подъехал пример 4, а фантазия для переменных уже на исходе
    //Радует, что эти же переменные будем использовать в примере 5
    public static double x1 = 1;
    public static double y1 = 0;
//    public static double z1 = x/y;

    public static void main(String[] args) {
        System.out.println("Hello, Князь!");
        b+= 1;
        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(a);

        //Выводим переменные из домашнего задания 1
        //Example 1
        System.out.println(total);

        //Example 2
        System.out.println("int: " + i1);
        System.out.println("float: " + f1);
        System.out.println("double: " + d1);
        System.out.println("short: " + s1);

        //Example 3
//        System.out.println(z);

        //Example 4
//        System.out.println(z1);
//        System.out.println("z1 + 1 = " + (z1 + 1));
        System.out.println("+0.0 == -0.0 : " + (0.0 == -0.0));
        System.out.println("x1/(+0.0) = " + (x1/(+0.0)));
        System.out.println("x1/(-0.0) = " + (x1/(-0.0)));

        //Example 5
//        System.out.println("z1 = " + z1);
//        System.out.println("z1 + 0 = " + (z1 + 0));
//        System.out.println("z1 < 0 = " + (z1 < 0));
//        System.out.println("z1 > 0 = " + (z1 > 0));
//        System.out.println("z1 == = " + (z1 == 0));
//        System.out.println("z1 != = " + (z1 != 0));
//        System.out.println("z1 == = " + (z1 == z1));
//        System.out.println("z1 != = " + (z1 != z1));
//        System.out.println("z1 == NaN: " + (z1 == Double.NaN));
//        System.out.println("z1 is NaN: " + Double.isNaN (c));
    }
}