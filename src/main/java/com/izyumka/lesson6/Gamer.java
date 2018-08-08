package com.izyumka.lesson6;

public class Gamer {
    private String nickname;
    private int number;
    protected Role role;
    private int numberOfFoul;

    public void vote(int numberOfGamer) {

    }

    public void getFoul() {
        numberOfFoul++;
    }

    public void speach(String speach) {
        System.out.println(speach);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getNumberOfFoul() {
        return numberOfFoul;
    }

    public void setNumberOfFoul(int numberOfFoul) {
        this.numberOfFoul = numberOfFoul;
    }
}
