package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);

        Boat b1 = new Boat("Cruise",1000);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
}