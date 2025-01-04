package org.gowtham.Algorithms.Searching;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;
            if(asc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
