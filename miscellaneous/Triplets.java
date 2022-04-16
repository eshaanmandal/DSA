package com.company;

import java.util.Arrays;

public class Triplets {
    public static void main(String[] args){
        int[] arr = new int[]{1,4,6,2,3,9};
        Arrays.sort(arr);
        int count=0;
        for(int i= arr.length-1; i>1; i--){
            int target = arr[i], low = 0, high = i-1;
            while(low < high){
                if(arr[low]+arr[high] == target) {
                    count++;
                    low++;
                    high--;
                }
                else if(arr[low]+arr[high] > target)
                    high--;
                else
                    low++;
            }
        }
        System.out.println(count);
    }
}
