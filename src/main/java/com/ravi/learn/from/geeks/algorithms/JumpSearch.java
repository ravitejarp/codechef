package com.ravi.learn.from.geeks.algorithms;

/**
 * Created by ravra03 on 12/25/2016.
 */
public class JumpSearch {
    public static void main(String[] args) {

    }

    public static int jumsearch(int[] arr, int val, int bsize) {
        int index = 0;
        for (int i = 0; i < arr.length; i = i + bsize) {
            if (val > arr[i]) {
                index = i - bsize;

            }

        }

        for (int i = index; i < index + bsize; i++) {
            if (arr[i] == val) {
                return i;
            }
        }

        return -1;
    }
}
