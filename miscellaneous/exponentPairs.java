package com.company;

import java.util.Arrays;

public class exponentPairs {
    static long Count(int x, int[] Y, int m, int[] freq){
        if(x==0)
            return 0;
        if(x==1)
            return freq[0];

        int idx = Arrays.binarySearch(Y, x);

        int countx = 0;
        if(idx < 0){
            idx = Math.abs(idx+1);
            countx = Y.length - idx;
        }
        else{
            while(idx<m && Y[idx] == x)
                idx++;
            countx = m - idx;
        }
        countx += (freq[0] + freq[1]);

        if (x == 2)
            countx -= (freq[3] + freq[4]);

        if (x == 3)
            countx += freq[2];

        return countx;

    }
    static long countPairs(int[] X, int[] Y, int n, int m){
        // for keeping track of exceptions count the number of 0,1,2,3,4 in Y
        int[] freq = new int[5];
        for(int i=0; i<m; ++i)
            if(Y[i] < 5)
                freq[Y[i]]++;

        Arrays.sort(Y);

        long count = 0;
        for(int i=0; i<n; ++i)
            count += Count(X[i], Y, m, freq);

        return count;

    }
    public static void main(String[] args){
        int[] A= new int[]{2, 1, 6};
        int[] B = new int[]{1, 5};
        long count = countPairs(A,B,A.length, B.length);
    }
}
