package com.lambdaschool;

public class Coins
{
    public String name;
    public double theValue;
    public int quantity;
//    private double inBank;
//
//    public double bankroll() {
//        return quantity * theValue;
//    }

    // constructor
    public Coins(String name, double theValue, int quantity) {
        this.name = name;
        this.theValue = theValue;
        this.quantity = quantity;
    }

    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheValue() {
        return theValue;
    }

    public void setTheValue(double theValue) {
        this.theValue = theValue;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Coins{" +
                "name='" + name + '\'' +
                ", theValue=" + theValue +
                ", quantity=" + quantity +
                '}';
    }
}
