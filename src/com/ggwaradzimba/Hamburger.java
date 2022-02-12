package com.ggwaradzimba;

import java.sql.SQLOutput;

public class Hamburger {
    private String breadRollType;
    private String patty; // the meat
    private Lettuce lettuce;
    private Tomato tomato;
    private Carrot carrot;
    private Cucumber cucumber;
    private double price;

    public Hamburger(String breadRollType, String patty, Lettuce lettuce, Cucumber
                     cucumber, Tomato tomato, Carrot carrot) {
        this.breadRollType = breadRollType;
        this.patty = patty;
        this.price = 10.00; // base price for hamburger
        this.lettuce = lettuce;
        this.cucumber = cucumber;
        this.carrot = carrot;
        this.tomato = tomato;
    }

    public Hamburger() {
        this.breadRollType = "White round roll";
        this.patty = "Beef";
        this.price = 10.00; // base price for hamburger
        this.lettuce = new Lettuce();
        this.cucumber = new Cucumber();
        this.carrot = new Carrot();
        this.tomato = new Tomato();
    }

    // getters
    public String getBreadRollType() {
        return this.breadRollType;
    }

    public String getPatty() {
        return this.patty;
    }

    public Lettuce getLettuce() {
        return this.lettuce;
    }

    public Tomato getTomato() {
        return this.tomato;
    }

    public Carrot getCarrot() {
        return this.carrot;
    }

    public Cucumber getCucumber() {
        return this.cucumber;
    }

    public double getPrice() {
        return this.price;
    }

    public void getTotalPrice() {
        double totalPrice = this.price; // add the base price
        System.out.println("Base price for " + getClass().getSimpleName() + " " + this.price);
        if(this.lettuce != null) {
            totalPrice += this.lettuce.getPrice();
            System.out.println("Add lettuce: " + this.lettuce.getPrice());
        }
        if(this.cucumber != null) {
            totalPrice += this.cucumber.getPrice();
            System.out.println("Add cucumber: " + this.cucumber.getPrice());
        }
        if(this.tomato != null) {
            totalPrice += this.tomato.getPrice();
            System.out.println("Add tomato: " + this.tomato.getPrice());
        }
        if(this.carrot != null) {
            totalPrice += this.carrot.getPrice();
            System.out.println("Add carrot: " + this.carrot.getPrice());
        }
        System.out.println("The total price for " + getClass().getSimpleName() + " is: " + totalPrice + "\n");
    }

}
