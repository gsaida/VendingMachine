package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StuffedAnimal {


    private String name;
    private BigDecimal price;
    private int quantity;
    private String soundMessage;


    public String getName(){
        return name;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getSoundMessage(){
        return soundMessage;
    }

    public StuffedAnimal(String name, BigDecimal price, int quantity, String soundMessage) {
        this.name = name;
        this.price=price;
        this.quantity = quantity;
        this.soundMessage=soundMessage;
    }

    public boolean dispenseAnimal() {
        if (quantity > 0) {
            quantity -= 1;
            return true;
        } else {
            return false;
        }
    }




//    private String name;
//    private BigDecimal price;
//    private String type;
//    private String call;
//
//    public String getName() { return name; }
//    public BigDecimal getPrice() { return price; }
//    public String getType() { return type; }
//    public String getCall() { return call; }
//
//    public List<BigDecimal> yellowDuck = new ArrayList<>();
//    public List<BigDecimal> getYellowDuck() { return yellowDuck; }
//
//    public List<BigDecimal> cubeDuck = new ArrayList<>();
//    public List<BigDecimal> getCubeDuck() { return cubeDuck; }
//
//    public List<BigDecimal>beachDuck = new ArrayList<>();
//    public List<BigDecimal> getBeachDuck() { return beachDuck; }
//
//    public List<BigDecimal> batDuck = new ArrayList<>();
//    public List<BigDecimal> getBatDuck() { return batDuck; }
//
//    public List<BigDecimal> emperorPenguin  = new ArrayList<>();
//    public List<BigDecimal> getEmperorPenguin() { return emperorPenguin; }
//
//    public List<BigDecimal> macaroniPenguin = new ArrayList<>();
//    public List<BigDecimal> getMacaroniPenguin() { return macaroniPenguin; }
//
//    public List<BigDecimal> rockhopperPenguin = new ArrayList<>();
//    public List<BigDecimal> getRockhopperPenguin() { return rockhopperPenguin; }
//
//    public List<BigDecimal> galapagosPenguin = new ArrayList<>();
//    public List<BigDecimal> getGalapagosPenguin() { return galapagosPenguin; }
//
//    public List<BigDecimal> blackCat = new ArrayList<>();
//    public List<BigDecimal> getBlackCat() { return blackCat; }
//
//    public List<BigDecimal> whiteCat = new ArrayList<>();
//    public List<BigDecimal> getWhiteCat() { return whiteCat; }
//
//    public List<BigDecimal> tabbyCat = new ArrayList<>();
//    public List<BigDecimal> getTabbyCat() { return tabbyCat; }
//
//    public List<BigDecimal> calicoCat = new ArrayList<>();
//    public List<BigDecimal> getCalicoCat() { return calicoCat; }
//
//    public List<BigDecimal> unicornPony = new ArrayList<>();
//    public List<BigDecimal> getUnicornPony() { return unicornPony; }
//
//    public List<BigDecimal> pegasusPony = new ArrayList<>();
//    public List<BigDecimal> getPegasusPony() { return pegasusPony; }
//
//    public List<BigDecimal> Horse = new ArrayList<>();
//    public List<BigDecimal> getHorse() { return Horse; }
//
//    public List<BigDecimal> rainbowHorse = new ArrayList<>();
//    public List<BigDecimal> getRainbowHorse() { return rainbowHorse; }
//
//
//    public StuffedAnimal() {
//        yellowDuck.add(BigDecimal.valueOf(0.90));
//        yellowDuck.add(BigDecimal.valueOf(0.90));
//        yellowDuck.add(BigDecimal.valueOf(0.90));
//        yellowDuck.add(BigDecimal.valueOf(0.90));
//        yellowDuck.add(BigDecimal.valueOf(0.90));
//    }

}
