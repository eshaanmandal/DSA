package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long arr1[] = new long[]{1,8,0,32,12};
        long arr2[] = new long[]{4,8,9,3,2};
        int n = arr1.length;
        int m = arr2.length;
        long merged[] = new long[n+m];
        int pos = 0;
        for(long element:arr1){
            merged[pos++] = element;
        }

        for(long element:arr2){
            merged[pos++] = element;
        }

        Arrays.sort(merged);

        for(int i=0;i<n;++i){
            arr1[i] = merged[i];
        }
        for(int i=n;i<n+m;++i){
            arr2[i-n] = merged[i];
        }
        for(long i:arr1){
            System.out.println(i);
        }

        for(long i:arr2){
            System.out.println(i);
        }
    }
}
