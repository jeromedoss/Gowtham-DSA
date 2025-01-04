package org.example;

public class SelectionSort {
    // Time complexity = O(n^2)
    // Space complexity = O(1)
    // This is not a stable sort when we have duplicates in an array
    public static void ascSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minindex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void desSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int maxIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
