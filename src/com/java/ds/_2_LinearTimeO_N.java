package com.java.ds;

public class _2_LinearTimeO_N {

    static int factorial(int n){
        int factRes = 1;
        for (int i=1; i<=n; i++){
            factRes *= i;
        }
        System.out.println("Factorial of "+n+" is :- "+ factRes);
        return factRes;
    }

    public static void main(String[] args) {
        factorial(4);
        factorial(5);
        factorial(15);
    }
}
