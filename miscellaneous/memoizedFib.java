package com.company;

public class memoizedFib {
    final int MAX = 1000;
    final int NIL = -1;
    int lookup[] = new int[MAX];

    void initialize(){
        for(int i=0; i<MAX; i++){
            lookup[i] = NIL;
        }
    }

    int fib(int n){
        if(lookup[n] == NIL){
            if(n <= 1){
                lookup[n] = n;
            }
            else{
                lookup[n] = fib(n-1) + fib(n-2);
            }
        }
        return lookup[n];
    }
    public static void main(String[] args){
        memoizedFib m = new memoizedFib();
        m.initialize();
        int ans = m.fib(40);
        System.out.println(ans);
    }
}
