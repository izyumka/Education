package com.izyumka.lesson6;

public class Mafia extends Gamer {
    protected Role role = Role.MAFIA;
private int shot;
    public void shot(int numberOfGamer) {
        setShot(numberOfGamer);
    }

    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }
}
