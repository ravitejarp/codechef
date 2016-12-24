package com.ravi.learn.from.geeks;

/**
 * Created by ravra03 on 11/5/2016.
 */
public class BinarySearch {
    static int[] searchArry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        System.out.println(searchElement(12, searchArry, 0, searchArry.length - 1));
        System.out.println(searchElement(1, searchArry, 0, searchArry.length - 1));
        System.out.println(searchElement(5, searchArry, 0, searchArry.length - 1));
        System.out.print(searchElement(10, searchArry, 0, searchArry.length - 1));
    }

    private static int searchElement(int i, int[] searchArry, int start, int end) {
        if (start == end) {
            if (i == searchArry[start]) {
                return start;
            }
            return -1;
        }
        int middle = (start + end) / 2;
        if (i < searchArry[middle]) {
            return searchElement(i, searchArry, start, middle-1);
        } else if (i > searchArry[middle]) {
            return searchElement(i, searchArry, middle + 1, end);
        } else if (i == searchArry[middle]) {
            return middle + 1;
        }
        return -1;


    }

}
