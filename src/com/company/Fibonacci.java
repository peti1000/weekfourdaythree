package com.company;

public class Fibonacci {

    public static void fibonacci() {
        int fibOne = 1;
        System.out.println(fibOne);
        int fibTwo = 1;
        System.out.println(fibTwo);
        while (fibTwo < 89) {
            int fibThree = fibOne + fibTwo;
            System.out.println(fibThree);
            fibOne = fibTwo + fibThree;
            System.out.println(fibOne);
            fibTwo = fibThree + fibOne;
            System.out.println(fibTwo);
        }
    }

}
