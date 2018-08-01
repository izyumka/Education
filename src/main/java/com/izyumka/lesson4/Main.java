package com.izyumka.lesson4;

public class Main {

    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar();
        Track track = new Track();
        passengerCar.setPrice(15);
        track.setPrice(30);


        Taxopark.getTaxoparkPrice(passengerCar, track);
        System.out.println(Taxopark.getTaxoparkPrice(passengerCar, track));
    }
}
