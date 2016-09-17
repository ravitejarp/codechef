package com.ravi.beginner;

import java.util.Scanner;

/**
 * Created by ravra03 on 9/13/2016.
 */
public class EnormousInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        final String[] nextLine = scanner.nextLine().split(" ");
        int iterator = Integer.parseInt(nextLine[0]);
        while (iterator > 0) {
            if (Double.parseDouble(scanner.nextLine()) % Integer.parseInt(nextLine[1]) == 0) {
                counter++;
            }
            iterator--;

        }
        System.out.print(counter);
    }
}
