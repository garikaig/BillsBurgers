package com.ggwaradzimba;

public class HealthyBurger extends Hamburger {
    private Pickle pickle;
    private Corgette corgette;
    private double price;

    public HealthyBurger(String patty, Lettuce lettuce, Cucumber cucumber,
                         Tomato tomato, Carrot carrot, Pickle pickle, Corgette corgette) {
        super("Brown rye bread roll", patty, lettuce, cucumber, tomato, carrot);
        this.pickle = pickle;
        this.corgette = corgette;
        this.price = 12.50; // base price for healthy bread roll type
    }

    // getters
    public Pickle getPickle() {
        return this.pickle;
    }

    public Corgette getCorgette() {
        return this.corgette;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void getTotalPrice() {

        double totalPrice = this.price; // add the base price for this roll type
        System.out.println("Base price for: " + getClass().getSimpleName() + " " + this.price);
        if(super.getLettuce() != null) {
            totalPrice += super.getLettuce().getPrice();
            System.out.println("Add lettuce: " + super.getLettuce().getPrice());
        }
        if(super.getCucumber() != null) {
            totalPrice += super.getCucumber().getPrice();
            System.out.println("Add cucumber: " + super.getCucumber().getPrice());
        }
        if(super.getTomato() != null) {
            totalPrice += super.getTomato().getPrice();
            System.out.println("Add tomato: " + super.getTomato().getPrice());
        }
        if(super.getCarrot() != null) {
            totalPrice += super.getCarrot().getPrice();
            System.out.println("Add carrot: " + super.getCarrot().getPrice());
        }
        // additional items for Healthy Burger
        if(this.pickle != null) {
            totalPrice += pickle.getPrice();
            System.out.println("Add Pickle: " + pickle.getPrice());
        }
        if(this.corgette != null) {
            totalPrice += corgette.getPrice();
            System.out.println("Add Corgette: " + corgette.getPrice());
        }
        System.out.println("The total price for " + getClass().getSimpleName() + " is: " + totalPrice + "\n");
    }
}
