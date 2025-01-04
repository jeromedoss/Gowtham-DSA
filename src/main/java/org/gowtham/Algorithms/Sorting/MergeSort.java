package org.example;

import java.util.Arrays;

public class MergeSort {

    // Divide and conquer
    public static int[] divideAndMerge(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = divideAndMerge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divideAndMerge(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                sorted[k++] = left[i++];
            }else {
                sorted[k++] = right[j++];
            }
        }
        while (i < left.length){
            sorted[k++] = left[i++];
        }
        while (j < right.length){
            sorted[k++] = right[j++];
        }
        return sorted;
    }

    public static void divideAndMergeInPlace(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = (start + end) /2;
       divideAndMergeInPlace(arr, start, mid);
       divideAndMergeInPlace(arr, mid, end);

       mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] sorted = new int[e -s];
        int i = s, j = m, k = 0;

        while (i < m && j < e){
            if(arr[i] < arr[j]){
                sorted[k++] = arr[i++];
            }else {
                sorted[k++] = arr[j++];
            }
        }
        while (i < m){
            sorted[k++] = arr[i++];
        }
        while (j < e){
            sorted[k++] = arr[j++];
        }
        for(k = 0; k < sorted.length; k++){
            arr[s + k] = sorted[k];
        }
    }
}
