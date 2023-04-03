package com.techelevator;

import java.math.BigDecimal;

public class Pony extends StuffedAnimal {

    public Pony(String name, BigDecimal price, int quantity, String soundMessage) {
        super(name, price, quantity, soundMessage);
    }


    static Pony unicornPony = new Pony("Unicorn Pony", BigDecimal.valueOf(1.95), 4, "Neigh, Neigh, Yay!");

    static Pony pegasusPony = new Pony("Pegasus Pony", BigDecimal.valueOf(1.85), 4, "Neigh, Neigh, Yay!");

    static Pony horse = new Pony("Horse", BigDecimal.valueOf(.90), 4, "Neigh, Neigh, Yay!");

    static Pony rainbowHorse = new Pony("Rainbow Horse", BigDecimal.valueOf(1.35), 4, "Neigh, Neigh, Yay!");

}


