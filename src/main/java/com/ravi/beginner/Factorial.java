//package com.ravi.beginner;
//
//import java.math.BigInteger;
//import java.util.Scanner;
//
///**
// * Created by ravra03 on 9/15/2016.
// */
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int counter = sc.nextInt();
//        while (counter >= 1) {
//            final int facto = sc.nextInt();
//            System.out.println(getTheFactorial(facto));
//            counter--;
//        }
//    }
//
//    private static int getTheFactorial(BigInteger facto) {
//        if (facto.equals(1)) {
//            return 1;
//        }
//        return facto * getTheFactorial(facto.subtract(new BigInteger(1l)));
//    }
//}
