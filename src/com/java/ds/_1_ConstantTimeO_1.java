package com.java.ds;

public class _1_ConstantTimeO_1 {

    //Constant Time: O(1)
    static int firstElement(int arr[]){
            return arr[0];
    }

    public static void main(String[] args) {
        System.out.println("1. Scores :- "+ firstElement(new int [] {12, 55, 67, 94, 22}));
        System.out.println("2. Scores :- "+ firstElement(new int [] {5, 2, 4, 1, 9, 6}));
    }
}
