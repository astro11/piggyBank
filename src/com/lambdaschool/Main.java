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

        System.out.println("\n **** The Contents of the Piggy Bank ****");
        System.out.println(coinsArrayList.get(1).quantity + " " + coinsArrayList.get(1).name);
        System.out.println(coinsArrayList.get(2).quantity + " " + coinsArrayList.get(2).name);
        System.out.println(coinsArrayList.get(0).quantity + " " + coinsArrayList.get(0).name);
        System.out.println(coinsArrayList.get(3).quantity + " " + coinsArrayList.get(3).name);
        System.out.println(coinsArrayList.get(4).quantity + " " + coinsArrayList.get(4).name);

        System.out.println("\n **** The Value of the Piggy Bank ****");
        for (Coins c : coinsArrayList)
        {
            System.out.println(c.getTheValue() * c.getQuantity());
        }


//        System.out.println("The piggy bank holds " + "$" + coinsArrayList.);

//        System.out.println(coinsArrayList.get(1).name + " has a whopping " + coinsArrayList.get(1).theValue * coinsArrayList.get(1).quantity);


//        for (Coins c : coinsArrayList)
//        {
//            System.out.println("\n*** PiggyBank ***");
//            System.out.println(coinsArrayList.get(1).theValue * coinsArrayList.get(1).quantity);
//        }
    }
}
