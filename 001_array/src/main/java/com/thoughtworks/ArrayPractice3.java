package com.thoughtworks;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
    public static int[] filterZero(int[] array) {
        int countZero = 0;
        for (int x : array) {
            if (x == 0) {
                countZero++;
            }
        }
        int[] newArray = new int[array.length - countZero];
        int i = 0;
        for (int value : array) {
            if (value != 0) {
                newArray[i] = value;
                i++;
            }
        }
        return newArray;
    }
}
