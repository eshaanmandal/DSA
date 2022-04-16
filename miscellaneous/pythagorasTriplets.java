package com.company;

import java.util.Arrays;

public class pythagorasTriplets {
    static boolean checkTriplets(int[] arr, int n){
        Arrays.sort(arr);
        int[] a_s = new int[n];
        for(int i=0; i<n;++i){
            a_s[i] = arr[i]*arr[i];
        }

        int ptr = n-1;
        while(ptr > 1){
            int start = 0, end = ptr-1;
            while(start < end){
                int sum = a_s[start] + a_s[end];

                if(sum == a_s[ptr]){
                    return true;
                }
                else if(sum > a_s[ptr]){
                    end--;
                }
                else{
                    start++;
                }
            }
            ptr--;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {3,2,4,6,5};
        System.out.println(checkTriplets(arr, arr.length));
    }
}
