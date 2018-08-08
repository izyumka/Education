package com.izyumka.lesson6;

public class Sheriff extends Citizen {
    protected Role role = Role.SHERIFF;

    public boolean check(Gamer gamer) {
        if (gamer.getRole() == Role.CITIZEN) {
            return false;
        }
        return true;
    }
}
