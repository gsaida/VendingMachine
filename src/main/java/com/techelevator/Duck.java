package com.techelevator;

import java.math.BigDecimal;

public class Duck extends StuffedAnimal {

    public Duck(String name, BigDecimal price, int quantity, String soundMessage) {
        super(name, price, quantity, soundMessage);
    }

    static Duck yellowDuck = new Duck("Yellow Duck", BigDecimal.valueOf(0.90), 4, "Quack, Quack, Splash");

    static Duck cubeDuck = new Duck ("Cube Duck", BigDecimal.valueOf(0.90), 4, "Quack, Quack, Splash");

    static Duck beachDuck = new Duck ("Beach Duck", BigDecimal.valueOf(1.50), 4, "Quack, Quack, Splash");

    static Duck batDuck = new Duck ("Bat Duck", BigDecimal.valueOf(2.00), 4, "Quack, Quack, Splash");

}
