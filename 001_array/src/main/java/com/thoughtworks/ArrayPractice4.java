package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int[] newArray = new int[array.length+1];
        if (number < array[0]) {
            int i = 1;
            newArray[0] = number;
            for (int value : array) {
                newArray[i] = value;
                i++;
            }
        } else if (number > array[array.length-1]) {
            int i = 0;
            newArray[array.length] = number;
            for (int value: array) {
                newArray[i] = value;
                i++;
            }
        } else {
            int i = 0;
            for (int value : array) {
                if (number >= value) {
                    newArray[i + 1] = number;
                    newArray[i] = value;
                    i += 2;
                    continue;
                }
                newArray[i] = value;
                i++;
            }
        }
        return newArray;
    }
}
