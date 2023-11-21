package com.java.ds;

public class _5_ExponentialTime_O_2Powern {

    // 0 1 1 2 3 5 8 13 21 34...
    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci(6) :- "+ fibonacci(6));
        System.out.println("Fibonacci(20) :- "+ fibonacci(20));
        System.out.println("Fibonacci(35) :- "+ fibonacci(35));
        System.out.println("Fibonacci(45) :- "+ fibonacci(45));

    }
}
