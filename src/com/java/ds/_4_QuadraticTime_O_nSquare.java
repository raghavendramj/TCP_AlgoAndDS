package com.java.ds;

public class _4_QuadraticTime_O_nSquare {


    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] < arr[j]){
                    int temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Element are....");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        bubbleSort(new int [] {5, 2, 4, 1, 9, 6});
        bubbleSort(new int [] {12, 55, 67, 94, 22});
    }
}
