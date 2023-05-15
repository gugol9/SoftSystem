package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad1 {

    public static void countingWords() {

        Map<String,Integer> map = new LinkedHashMap<>();


        File file = new File("/Users/kamilmarkowski/Desktop/Kamil-Markowski-SoftSystem/src/com/company/text.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.next();

                if (!map.containsKey(line)){
                    map.put(line,1);
                }else map.put(line,map.get(line)+1);

                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("/Users/kamilmarkowski/Desktop/Kamil-Markowski-SoftSystem/src/com/company/result.txt");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String word = entry.getKey();
                int count = entry.getValue();
                writer.write(word + " " + count + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
