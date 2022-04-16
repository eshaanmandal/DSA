package com.company;

public class RearrangeAlternate {
    public static void main(String[] args){
        int[] arr = new int[]{10,20,30,40,50,60,70,80,90,100,110};
        int temp, end = arr.length-1;
        for(int i=0; i<arr.length; i+=2){
            temp = arr[end];
            for(int j=arr.length-1; j>i;j--){
                arr[j]  = arr[j-1];
            }
            arr[i]  =temp;
        }
        for(int i:arr){
            System.out.printf("%d ",i);
        }
    }
}
