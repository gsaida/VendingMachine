package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, StuffedAnimal> slots = new HashMap<>();


    public void fillSlots() {

        slots.put("A1", Duck.yellowDuck);
        slots.put("A2", Duck.cubeDuck);
        slots.put("A3", Duck.beachDuck);
        slots.put("A4", Duck.batDuck);
        slots.put("B1", Penguin.emperorPenguin);
        slots.put("B2", Penguin.macaroniPenguin);
        slots.put("B3", Penguin.rockHopperPenguin);
        slots.put("B4", Penguin.galapagosPenguin);
        slots.put("C1", Cat.blackCat);
        slots.put("C2", Cat.whiteCat);
        slots.put("C3", Cat.tabbyCat);
        slots.put("C4", Cat.calicoCat);
        slots.put("D1", Pony.unicornPony);
        slots.put("D2", Pony.pegasusPony);
        slots.put("D3", Pony.horse);
        slots.put("D4", Pony.rainbowHorse);

    }

//    public int changeInventory(){
//
//    }
    public Map<String, StuffedAnimal> getSlots() {
        return slots;
    }

}
