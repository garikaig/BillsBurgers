package com.ggwaradzimba;

public class DeluxeHamburger extends Hamburger {
    private Chips chips;
    private Drink drink;
    private double price;

    public DeluxeHamburger(Chips chips, Drink drink) {
        super ();
        this.chips = chips;
        this.drink = drink;
        this.price = 10.00;
    }

    public Chips getChips() {
        return this.chips;
    }

    public Drink getDrink() {
        return this.drink;
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
        // additional items for Deluxe Burger
        if(this.chips != null) {
            totalPrice += chips.getPrice();
            System.out.println("Chips: " + chips.getPrice());
        }
        if(this.drink != null) {
            totalPrice += drink.getPrice();
            System.out.println("Drink with flavour " + drink.getFlavour() + " " + drink.getPrice());
        }
        System.out.println("The total price for " + getClass().getSimpleName() + " is: " + totalPrice + "\n");
    }
}
