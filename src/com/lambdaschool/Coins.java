package com.lambdaschool;

public class Coins
{
    private String name;
    private int theValue;

    // constructor
    public Coins(String name, int theValue) {
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

    public int getTheValue() {
        return theValue;
    }

    public void setTheValue(int theValue) {
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
