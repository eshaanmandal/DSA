package com.company;

public class countPath {
    static int count_path(int m, int n){
        if(m==1 || n==1)
            return 1;
        return count_path(m-1,n) + count_path(m, n-1);
    }
    public static void main(String[] args){
        System.out.println(count_path(20,20));
    }
}
