package com.izyumka.lesson6;

public class Don extends Mafia {
    protected Role role = Role.DON;

    public boolean check(Gamer gamer) {
        if (gamer.getRole() == Role.SHERIFF) {
            return true;
        }
        return false;

    }
}
