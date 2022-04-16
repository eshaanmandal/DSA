package com.company;

import java.util.Arrays;

public class spiralTraversal {

    public static void traverse(int[][] arr,int N, int M){
        int s_row=0, e_row=N-1, s_col=0, e_col=M-1;
        // we have to run the loop until all the variables s_row, s_col points at the same location
        while(s_row <= e_row && s_col <= e_col){
            for(int i=s_col; i<=e_col; i++){
                System.out.print(arr[s_row][i] + " ");
            }
            s_row = s_row+1;

            for(int i=s_row; i<=e_row; i++){
                System.out.print(arr[i][e_col]+ " ");
            }
            e_col = e_col - 1;

            if(s_row <= e_row){
                for(int i=e_col; i>=s_col; i--){
                    System.out.print(arr[e_row][i]+ " ");
                }
                e_row = e_row-1;
            }

            if(s_col <= e_col){
                for(int i=e_row; i>=s_row; i--){
                    System.out.print(arr[i][s_col]+ " ");
                }
                s_col = s_col+1;
            }
        }
    }
    public static void main(String[] args){
        int N = 3, M = 4;
        int[][] arr = {
                {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}
        };

        traverse(arr, N, M);


    }
}
