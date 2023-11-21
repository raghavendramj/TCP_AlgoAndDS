package com.java.ds;

public class _3_LogarithmTime_Ologn {

    public static void main(String[] args) {
        //int arr[] = new int[5];
        int arr[] = {12, 22, 45, 67, 96};

        binarySearch(arr, 45, 0, arr.length - 1);
        binarySearch(arr, 67, 0, arr.length - 1);

    }

    static int binarySearch(int arr[], int n, int start, int end) {
        if (n < 1) {
            return -1;
        }
        int mid = (start + end) / 2;

        //Condition 1 :- If Element found at mid index.
        if (arr[mid] == n) {
            System.out.println("Element("+n+")'s Index :- " + mid);
            return mid;
        }

        if (arr[mid] < n) {
            //If Element is at right side, then mid+1 --> end
            return binarySearch(arr, n, mid + 1, end);
        } else {
            //If Element is at left side, then start --> mid-1
            return binarySearch(arr, n, start, mid - 1);
        }
    }
}
