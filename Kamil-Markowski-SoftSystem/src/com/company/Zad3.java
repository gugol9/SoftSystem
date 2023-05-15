package com.company;

public class Zad3 {

    public static int findGreatestOddDivisorIterative(int n) {



        if (n % 2 != 0) {
            return n;
        }

        return findGreatestOddDivisorIterative(n / 2);

    }
}
