package com.techelevator;

import java.math.BigDecimal;

public class Penguin extends StuffedAnimal{

    public Penguin(String name, BigDecimal price, int quantity, String soundMessage) {
        super(name, price, quantity, soundMessage);
    }

    static Penguin emperorPenguin = new Penguin("Emperor Penguin", BigDecimal.valueOf(2.80), 4, "Squawk, Squawk, Whee!");

    static Penguin macaroniPenguin = new Penguin("Macaroni Penguin", BigDecimal.valueOf(2.25), 4, "Squawk, Squawk, Whee!");

    static Penguin rockHopperPenguin = new Penguin("Rockhopper Penguin", BigDecimal.valueOf(1.50), 4, "Squawk, Squawk, Whee!");

    static Penguin galapagosPenguin = new Penguin("Galapagos Penguin", BigDecimal.valueOf(1.25), 4, "Squawk, Squawk, Whee!");

}
