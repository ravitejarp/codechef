package com.ravi.beginner;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by ravra03 on 9/13/2016.
 */
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String nextLine = sc.nextLine();
        final String[] amountAndBal = nextLine.split(" ");
        if (Integer.parseInt(amountAndBal[0]) % 5 == 0 && Double.parseDouble(amountAndBal[1])-0.5 >= Double.parseDouble(amountAndBal[0]) && Double.parseDouble(amountAndBal[0])<=2000 && Double.parseDouble(amountAndBal[1])<=2000) {
            NumberFormat formatter = new DecimalFormat("#0.00");
            System.out.println(formatter.format(Double.parseDouble(amountAndBal[1]) - Double.parseDouble(amountAndBal[0]) - 0.50));
        } else {
            System.out.println(amountAndBal[1]);
        }
    }
}
