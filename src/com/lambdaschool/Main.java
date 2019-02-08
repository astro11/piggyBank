package com.lambdaschool;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Coins> coinsArrayList = new ArrayList<>();
        coinsArrayList.add(new Coins("Dollar", 1.00, 5));
        coinsArrayList.add(new Coins("Quarter", 0.25,1));
        coinsArrayList.add(new Coins("Dime", 0.10,1));
        coinsArrayList.add(new Coins("NicPenkle", 0.05,3));
        coinsArrayList.add(new Coins("Penny", 0.01,10));


        System.out.println(coinsArrayList.get(1).theValue * coinsArrayList.get(1).quantity);


//        for (Coins c : coinsArrayList)
//        {
//            System.out.println("\n*** PiggyBank ***");
//            System.out.println(coinsArrayList.get(1).theValue * coinsArrayList.get(1).quantity);
//        }
    }
}
