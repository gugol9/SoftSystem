package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad5 {
    public static void zad5(){
        int sum = 0;
        File file = new File("/Users/kamilmarkowski/Desktop/Kamil-Markowski-SoftSystem/src/com/company/softsystem.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[^0-9]+");
            while (scanner.hasNextInt()) {
                String linia = scanner.nextLine();
                String[] elementy = linia.split(",");

                if (elementy.length >= 3) {
                    String imie = elementy[0];
                    String nazwisko = elementy[1];
                    int sumaPunktow = 0;

                    for (int i = 2; i < elementy.length; i++) {
                        sumaPunktow += Integer.parseInt(elementy[i]);
                    }

                    if (sumaPunktow > 50)
                        System.out.println( imie + " " + nazwisko + " gained " + sumaPunktow + " points and passed the exam." );
                    else  System.out.println( imie + " " + nazwisko + " gained " + sumaPunktow + " points and did not pass the exam." );


                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
