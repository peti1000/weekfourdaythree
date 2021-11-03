package com.company;

import java.util.Arrays;

public class Matrix {
    public static void matrix() {
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

