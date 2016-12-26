package com.ravi.learn.from.geeks.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ravra03 on 11/5/2016.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {21, 2, 121, 21, 314324, 3};
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(112);
        arrayList.add(122);
        arrayList.add(1112);
        arrayList.add(412);
        LinearSearch ls = new LinearSearch();
        System.out.println("The index of 21 is:" + ls.linearSearch(arr, 21));
        System.out.println("The index of 412 is:" + ls.linearSearch(arrayList, 412));

    }

    public int linearSearch(int[] arr, int key) {
        for (int num = 0; num < arr.length; num++) {
            if (arr[num] == key) {
                return num;
            }
        }
        return -1;
    }

    public int linearSearch(List<Integer> arr, int key) {
        for (int num = 0; num < arr.size(); num++) {
            if (arr.get(num) == key) {
                return num;
            }
        }
        return -1;
    }

}
