package com.ravi.beginner;

import java.io.*;
//import java.io.IOException;
//import java.io.InputStreamReader;

/**
 * Created by ravra03 on 9/13/2016.
 */
public class LifeUniverseEverything {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            final int nextInt = Integer.parseInt(bufferedReader.readLine());
            if (nextInt == 42) {
                break;
            } else {
                System.out.println(nextInt);
            }

        }

    }
}
