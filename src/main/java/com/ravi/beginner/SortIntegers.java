package com.ravi.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Teja on 9/17/2016.
 */
public class SortIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        Integer[] arrayOfNum = new Integer[counter];
        int i = 0;
        while (counter >= 1) {
            Integer nextInt = sc.nextInt();
            arrayOfNum[i] = nextInt;
            i++;
            counter--;
        }
        Collections.sort(Arrays.asList(arrayOfNum));
        for (Integer s : arrayOfNum) {
            System.out.println(s);
        }
    }
}
