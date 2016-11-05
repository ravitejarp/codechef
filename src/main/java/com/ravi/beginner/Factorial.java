package com.ravi.beginner;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ravra03 on 9/15/2016.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        while (counter >= 1) {
            final int facto = sc.nextInt();
            System.out.println(getTheFactorialOfInt(BigInteger.valueOf(facto)));
            counter--;
        }
    }


    private static BigInteger getTheFactorialOfInt(BigInteger facto) {
        BigInteger finalVal = BigInteger.valueOf(1);
        for (BigInteger i = facto; i.compareTo(BigInteger.valueOf(0)) > 0; i = i.subtract(BigInteger.valueOf(1))) {
            finalVal = finalVal.multiply(i);
        }
        return finalVal;
    }

}
