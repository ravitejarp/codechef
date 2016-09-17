package com.ravi.beginner;

import java.util.Scanner;

/**
 * Created by ravra03 on 9/13/2016.
 */
public class FactorialToFindTrailingZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        while (nextInt > 0) {
            int facto = scanner.nextInt();
            int counter = 0;
            for (int count = 5; facto / count >= 1; count *= 5) {
                counter += facto / count;
            }
            System.out.println(counter);
            nextInt--;
        }
    }
}
