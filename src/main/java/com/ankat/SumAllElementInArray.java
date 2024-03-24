package com.ankat;

import java.util.Arrays;

public class SumAllElementInArray {
    public static void main(String[] args) {
        int[] array = { 11, 24, 3, 14, 53 };
        System.out.println(Arrays.stream(array).sum());
    }
}
