package com.izyumka.lesson4;

public class Taxopark {

    public static int getTaxoparkPrice(PassengerCar pcar, Track track) {
        return pcar.getPrice() + track.getPrice();

    }

}
