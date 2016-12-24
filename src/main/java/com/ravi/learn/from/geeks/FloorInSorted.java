package com.ravi.learn.from.geeks;

/**
 * Created by ravra03 on 12/24/2016.
 */
public class FloorInSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        System.out.println(floorValue(0, arr, 0, arr.length - 1));

    }

    public static int floorValue(int i, int[] searchArry, int start, int end) {
        if (start == end) {
            if (i < searchArry[start]) {
                return start - 1;
            } else {
                return start;
            }
        }
        int middle = (start + end) / 2;
        if (i < searchArry[middle]) {
            return floorValue(i, searchArry, start, middle - 1);
        } else if (i > searchArry[middle]) {
            return floorValue(i, searchArry, middle + 1, end);
        } else if (i == searchArry[middle]) {
            return middle + 1;
        }
        return middle + 1;

    }
}
