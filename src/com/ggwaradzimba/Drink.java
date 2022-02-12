package com.ggwaradzimba;

public class Drink {
    private String flavour;
    private double price;

    public Drink(String flavour) {
        this.flavour = flavour;
        setPrice(this.flavour);
    }

    public void setPrice(String flavour) {
        // coke is default drink if flavour is not selected
        switch (flavour.toLowerCase()) {
            case "coke":
                this.price = 2.50;
                break;
            case "fanta":
                this.price = 2.00;
                break;
            case "sprite":
                this.price = 2.25;
                break;
            case "orange juice":
                this.price = 3.50;
                break;
            case "apple juice":
                this.price = 3.00;
                break;
            default:
                this.price = 2.50;  // the default drink is coke
                this.flavour = "coke";
        }
    }

    public String getFlavour() {
        return this.flavour;
    }

    public double getPrice() {
        return this.price;
    }
}
