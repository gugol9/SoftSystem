package com.company;

import java.util.Arrays;

public class Zad2 {
    public static int evaluateExpression(String expression) {

        return Arrays.stream(expression.split("(?=[+-])"))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
