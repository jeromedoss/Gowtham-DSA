package TestAlgorithms;

import org.gowtham.Algorithms.Sorting.BubbleSort;
import org.gowtham.Algorithms.Sorting.InsertionSort;
import org.gowtham.Algorithms.Sorting.MergeSort;
import org.gowtham.Algorithms.Sorting.SelectionSort;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestSort {
    @Test
    public void testSelectionSort(){
        int[] arr = {5,37,99,25,78};
        SelectionSort.ascSort(arr);
        System.out.println(Arrays.toString(arr));
        SelectionSort.desSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void testBubbleSort(){
        int[] arr = {5,37,99,25,78};
        BubbleSort.ascSort(arr);
        System.out.println(Arrays.toString(arr));
        BubbleSort.desSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void testInsertionSort(){
        int[] arr = {5,37,99,25,78};
        InsertionSort.ascSort(arr);
        System.out.println(Arrays.toString(arr));
        InsertionSort.desSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testMergeSort(){
        int[] arr = {5,37,99,25,78};
        arr = MergeSort.divideAndMerge(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{5, 37, 99, 25, 78};
        MergeSort.divideAndMergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
