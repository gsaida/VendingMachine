package com.techelevator;

import java.math.BigDecimal;

public class Cat extends StuffedAnimal{

    public Cat(String name, BigDecimal price, int quantity, String soundMessage) {
        super(name, price, quantity, soundMessage);
    }

    static Cat blackCat = new Cat("Black Cat", BigDecimal.valueOf(2.25), 4, "Meow, Meow, Meow!");

    static Cat whiteCat = new Cat("White Cat", BigDecimal.valueOf(2.50), 4, "Meow, Meow, Meow!");

    static Cat tabbyCat = new Cat("Tabby Cat", BigDecimal.valueOf(2.50), 4, "Meow, Meow, Meow!");

    static Cat calicoCat = new Cat("Calico Cat", BigDecimal.valueOf(3.55), 4, "Meow, Meow, Meow!");

}
