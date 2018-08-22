package com.izyumka.training2;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Evgeniy", "Izyumov", "Aleksndrovich", 28.04, "Shamrila 17", "0985263931", "ICIT", 6, "US612");
        students[1] = new Student("Shapoval", "Pavel", "Vladimirovich", 18.03, "Pushkina", "09856763931", "KICIT", 6, "US612");


        String myCourse = "ICIT";
        for (int i = 0; i < students.length; i++) {
            if (myCourse == students[i].getFaculty()) {
                System.out.println(students[i]);
            }
        }

    }
}
