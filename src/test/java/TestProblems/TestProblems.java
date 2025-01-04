package TestProblems;

import org.gowtham.ProblemSolving.ProblemSolving;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestProblems {

    @Test
    public void testProblemOne(){
        int[] arr = {1, 6, 7, 4, 2, 3, 2};
        ProblemSolving.oddEvenSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testCountOccurrence(){
        int[] arr = {1, 2, 6, 6, 7, 4, 2, 3, 2};
        System.out.println(ProblemSolving.checkOccurrence(arr, 2, arr.length - 1));
    }

    @Test
    public void testSortnessOfAnArray(){
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        System.out.println(ProblemSolving.checkSortArray(arr, 0));
    }
    @Test
    public void testBunnies(){
        System.out.println(ProblemSolving.bunnyEars2(2));
    }

    @Test
    public void testFibonacci(){
        System.out.println(ProblemSolving.fibonacci(5));
    }
    @Test
    public void testSortString() {
        System.out.println(ProblemSolving.sortString("dcab"));

        String t = "Testeruser";
        //TODO: check the occurrence of all characters in a given string
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            }else {
                map.put(t.charAt(i), 1);
            }
        }
        for(Character c : map.keySet()){
            System.out.println(c + " : " + map.get(c));
        }
    }

    @Test
    public void testRomanToInteger(){
        System.out.println(ProblemSolving.romanToInteger("III"));
        System.out.println(ProblemSolving.romanToInteger("LVIII"));
        System.out.println(ProblemSolving.romanToInteger("MCMXCIV"));
    }

    @Test
    public void testFirstOccurrence(){
        System.out.println(ProblemSolving.firstOccurrence("sadbutsad", "sado"));
    }
}
