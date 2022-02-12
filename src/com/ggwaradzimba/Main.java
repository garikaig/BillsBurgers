package com.ggwaradzimba;

/* This application manages the process of selling hamburgers. The application enables selection of different
/* type of burgers */

public class Main {

    public static void main(String[] args) {

        // instantiate all additions to the burgers
        Lettuce lettuce = new Lettuce();
        Tomato tomato = new Tomato();
        Cucumber cucumber = new Cucumber();
        Carrot carrot = new Carrot();

        // the following only relevant for Healthy Burger
        Corgette corgette = new Corgette();
        Pickle pickle = new Pickle();

        Hamburger hamburger = new Hamburger("White round roll","Beef",null,
                cucumber, tomato, null);

        hamburger.getTotalPrice();

        HealthyBurger healthyBurger = new HealthyBurger("Chicken",lettuce,cucumber,tomato,
                    carrot,pickle,null);

        healthyBurger.getTotalPrice();

        // the following only relevant for Deluxe Burger
        Chips chips = new Chips();
        Drink drink = new Drink("orange juice");
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger(chips,drink);

        deluxeHamburger.getTotalPrice();
    }
}
