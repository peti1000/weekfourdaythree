package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ZeroToHundred list = new ZeroToHundred();
        list.zeroToHundred();
        SumOfZeroToHundred sumOf = new SumOfZeroToHundred();
        sumOf.sumOfZeroToHundred();
        Fibonacci fibo = new Fibonacci();
        fibo.fibonacci();
        AnimalSounds sound = new AnimalSounds();
        sound.sounds();

        //     zeroToHundred();
        //     sumOfZeroToHundred();
        //     fibonacci();
        //     sounds();
        //     arrayList();
        //     firstLetter();
        //     longestWord();
        //     matrix();
    }

    //1. Write a loop that iterates through numbers from 0 to 100 and prints each number.
//    private static void zeroToHundred() {
//        int i = 0;
//        while (i <= 100) {
//            System.out.println(i);
//            i++;
//        }
//    }

    //2. Write a loop that iterates through numbers from 0 to 100 and prints the sum of the numbers.
//    private static void sumOfZeroToHundred() {
//        int i = 0;
//        int sum = 0;
//        while (i <= 100) {
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);
//    }

    //3. Write a loop that calculates the Fibonacci numbers under 100 and prints each one of them.
//    private static void fibonacci() {
//        int fibOne = 1;
//        System.out.println(fibOne);
//        int fibTwo = 1;
//        System.out.println(fibTwo);
//        while (fibTwo < 89) {
//            int fibThree = fibOne + fibTwo;
//            System.out.println(fibThree);
//            fibOne = fibTwo + fibThree;
//            System.out.println(fibOne);
//            fibTwo = fibThree + fibOne;
//            System.out.println(fibTwo);
//        }
//    }

    //4. Write a loop that iterates through an array of strings and prints each one of them.
    //Array: {"moo","bark","meow","rawr","screech","chirp","growl","buzz","quack"}
//    private static void sounds() {
//        String[] sound = {"moo", "bark", "meow", "rawr", "screech", "chirp", "growl", "buzz", "quack"};
//        for (String i : sound) {
//            System.out.println(i);
//        }
//    }

    //5. Write a loop that iterates through the last array and adds each element to an ArrayList.
    private static void arrayList() {
        String[] sound = {"moo", "bark", "meow", "rawr", "screech", "chirp", "growl", "buzz", "quack"};
        List<String> arr = new ArrayList<>();
        for (String i : sound) {
            arr.add(i);
        }
        System.out.println(arr);
    }

    //6. Write a loop that iterates through that last ArrayList and collects the first letter of each element to a string. Print it after its done.
    private static void firstLetter() {
        String[] sound = {"moo", "bark", "meow", "rawr", "screech", "chirp", "growl", "buzz", "quack"};
        List<String> arr = new ArrayList<>();
        for (String i : sound) {
            arr.add(i);
        }
        String firstchar = "";
        for (String j : arr) {
            firstchar += j.charAt(0);
        }
        System.out.println(firstchar);
    }

    //7. Write an algorithm to find the longest word in the last ArrayList and print it.
    private static void longestWord() {
        String[] sound = {"moo", "bark", "meow", "rawr", "screech", "chirp", "growl", "buzz", "quack"};
        List<String> arr = new ArrayList<>();
        for (String i : sound) {
            arr.add(i);
        }
        String longest = " ";
        for (String i : arr) {
            if (i.length() >= longest.length()) {
                longest = i;
            }
        }
        System.out.println(longest);
    }

    //8. Write an algorithm that creates a matrix with 10 rows and 10 columns and fills it with numbers.
    //        - 8.1 Where both the row and the column index is even put 0.
    //        - 8.2 Where one of them is odd put 1.
    //        - 8.3 Where both of them is odd put 2.
    //        - 8.4 Print the matrix to show rows and columns accurately.
    private static void matrix() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i % 2 == 0 && j % 2 == 0){
                    matrix[i][j] = 0;
                } else if(i % 2 == 0 || j % 2 == 0){
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 2;
                }
            }
        }
        for (int[] rows : matrix) {
                System.out.println(Arrays.toString(rows));
            }
            System.out.println();
        }
    }






