package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int i = 0;
   //     zeroToHundred(i);
   //     sumOfZeroToHundred(i);
   //    fibonacci();
   //     sounds();

    }
    //1. Write a loop that iterates through numbers from 0 to 100 and prints each number.
    private static void zeroToHundred(int i){

        while(i <= 100){
            System.out.println(i);
            i++;
        }
    }
    //2. Write a loop that iterates through numbers from 0 to 100 and prints the sum of the numbers.
    private static void sumOfZeroToHundred(int i){

        int sum = 0;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    //3. Write a loop that calculates the Fibonacci numbers under 100 and prints each one of them.
    private static void fibonacci(){
        int fibOne = 1;
        System.out.println(fibOne);
        int fibTwo = 1;
        System.out.println(fibTwo);
        while(fibTwo < 89){
            int fibThree = fibOne + fibTwo;
            System.out.println(fibThree);
            fibOne = fibTwo + fibThree;
            System.out.println(fibOne);
            fibTwo = fibThree + fibOne;
            System.out.println(fibTwo);
        }
    }
    //4. Write a loop that iterates through an array of strings and prints each one of them.
    //Array: {"moo","bark","meow","rawr","screech","chirp","growl","buzz","quack"}
    private static void sounds(){
        String[] sound = {"moo","bark","meow","rawr","screech","chirp","growl","buzz","quack"};
        for (String i: sound) {
            System.out.println(i);
        }
    }
}
