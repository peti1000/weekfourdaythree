package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        zeroToHundred(i);
        sumOfZeroToHundred(i);

    }
    private static void zeroToHundred(int i){

        while(i <= 100){
            System.out.println(i);
            i++;
        }
    }
    private static void sumOfZeroToHundred(int i){

        int sum = 0;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
