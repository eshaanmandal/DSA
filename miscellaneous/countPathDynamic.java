package com.company;
import java.util.*;

public class countPathDynamic {

    static int pathcount(int m, int n, int[][] lookup){
        if(m == 0 || n == 0){
            return lookup[m][n] = 1;
        }
        if(lookup[m][n] == 0)
            lookup[m][n] = pathcount(m-1, n, lookup) + pathcount(m, n-1, lookup);
        return lookup[m][n];
    }

    public static void main(String[] args){
        int m=20, n=20;
        int[][] lookup = new int[m][n];

        int paths = pathcount(m-1,n-1,lookup);
        System.out.println(paths);

    }
}
