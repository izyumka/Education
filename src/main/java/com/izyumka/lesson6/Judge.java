package com.izyumka.lesson6;

public class Judge {
    public void setFoul() {
    }

    public void giveaNumbers(Gamer[] gamers) {
        int[] getNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < gamers.length; i++) {
            System.out.println(gamers[i]);
            gamers[i].setNumber(i + 1);

        }

    }

    public Gamer[] giveaRole(Gamer[] gamers) {
        gamers[0] = new Citizen();
        gamers[1] = new Citizen();
        gamers[2] = new Citizen();
        gamers[3] = new Citizen();
        gamers[4] = new Citizen();
        gamers[5] = new Citizen();
        gamers[6] = new Sheriff();
        gamers[7] = new Mafia();
        gamers[8] = new Mafia();
        gamers[9] = new Don();
        return gamers;
    }

    public int countShots(Mafia[] gamersOfMafia) {
        for (int i = 0; i < gamersOfMafia.length; i++) {
            if (gamersOfMafia[0].getShot() != gamersOfMafia[i].getShot())
                return 0;
        }
        return gamersOfMafia[0].getShot();
    }
}
