package com.lambdaschool;

public class Coins
{
    private String name;
    private double theValue;

    // constructor
    public Coins(String name, double theValue) {
        this.name = name;
        this.theValue = theValue;
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

    @Override
    public String toString() {
        return "Coins{" +
                "name='" + name + '\'' +
                ", theValue=" + theValue +
                '}';
    }
}
