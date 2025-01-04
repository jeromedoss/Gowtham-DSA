package org.gowtham.Algorithms.Sorting;

public class BubbleSort {
    // Time complexity = O(n^2)
    // Space complexity = O(1) - since we don't use any extra space for any extra array, we can ignore the temp variables as its occupies very less space
    // It's a stable sort, duplicates won't be sorted even when placed nearby
    public static void ascSort(int[] arr){
        for(int i=1; i<arr.length;i++){
            for(int j = 0; j<arr.length - i; j++){
                if(arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j +1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void desSort(int[] arr){
        for(int i=1; i<arr.length;i++){
            for(int j = arr.length -1; j> i-1; j--){
                if(arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
