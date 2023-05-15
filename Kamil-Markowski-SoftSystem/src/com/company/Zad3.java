package com.company;

public class Zad3 {

    public static int zad3(int n){
        if (n < 0 || n > 106)  throw new IllegalArgumentException("bad");

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0 && i % 2 != 0) {
                return i;
            }
        }
        return 1;
    }
}
