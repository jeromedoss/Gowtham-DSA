package TestAlgorithms;

import org.gowtham.Algorithms.Searching.BinarySearch;
import org.gowtham.Algorithms.Searching.LinearSearch;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestSearch {

    @Test
    public void testLinearSearch(){
        int[] arr = {4, 5, 7, 9, 45, 78, 92, 0};
        int index = LinearSearch.find(arr, 45);
        System.out.println("index is " + index);
        System.out.println(LinearSearch.contains(arr, 9));
        int[][] arrMulti = {
                {2, 3, 8},
                {3, 9, 1},
                {0, 9, 3}
        };

        int[]  indexes = LinearSearch.findInArray(arrMulti, 8);
        System.out.println(Arrays.toString(indexes));

    }

    @Test
    public void testBinarySearch() {
        int[] arr = {4, 5, 7, 9, 45, 78, 92, 0};
        Arrays.sort(arr);
        int index = BinarySearch.search(arr, 45);
        System.out.println("index is " + index);
    }
}
