package com.izyumka.lesson6;

public class Game {
    public static void main(String[] args) {
        Gamer[] gamers = new Gamer[10];
        int[] numberOfDays = new int[8];
        Judge judge = new Judge();
        for (int i = 0; i < gamers.length; i++) {
            gamers[i] = new Gamer();
        }

        judge.giveaNumbers(gamers);
        Gamer[] gamersWithRole = judge.giveaRole(gamers);
        System.out.println(gamersWithRole[0].getRole());
    }
}
