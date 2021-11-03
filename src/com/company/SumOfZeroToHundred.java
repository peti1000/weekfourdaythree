package com.company;

public class SumOfZeroToHundred {

    public static void sumOfZeroToHundred() {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}
