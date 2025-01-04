package org.gowtham.ProblemSolving;

import java.util.*;

public class ProblemSolving {


    // TODO: Sort the array based on odd or even, sort the even to the left and odd to the right of the array.
    public static void oddEvenSort(int[] arr) {
        int i = 0;
        int j = arr.length -1;
        while(i < j){
            while(arr[i] % 2 == 0 && i < j){
                i++;
            }
            while(arr[j] % 2 != 0 && i < j){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static int checkOccurrence(int[] arr, int target, int end){
        if(end < 0){
            return 0;
        }
        int count = 0;
        if(arr[end] == target){
             count++;
        }
        return count + checkOccurrence(arr, target, --end);
    }

    public static boolean checkSortArray(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i + 1] < arr[i]){
            return false;
        }
        return checkSortArray(arr, ++i);
    }

    public static int bunnyEars2(int bunnies) {
        if(bunnies == 0 ){
            return 0;
        }
        int count = bunnies % 2 == 0 ? 3 : 2;
        return count + bunnyEars2(-- bunnies);
    }

    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static String sortString(String s){
        char[] arr = s.toCharArray();
        char temp = 0;
        for (int i = 0; i < s.length() - 1; i++){
            for(int j = i + 1; j < s.length(); j++) {
                if (arr[i] > arr[j]) {
                    temp =  arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
       return Arrays.toString(arr);
    }

    public static int romanToInteger(String romanString){
        Map<Character, Integer> roman = new LinkedHashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int sum = roman.get(romanString.charAt(romanString.length() - 1));
        for(int i = romanString.length() - 2; i >= 0; i--) {
            if(roman.get(romanString.charAt(i)) < roman.get(romanString.charAt(i + 1))){
                sum -= roman.get(romanString.charAt(i));
            }else{
                sum += roman.get(romanString.charAt(i));
            }
        }
        return sum;
    }
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(commonPrefix) != 0){
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if(commonPrefix.isEmpty()){
                    return "";
                }
            }
        }
        return commonPrefix;
    }
    public boolean validParenthesis(String str) {
        Map<Character, Character> paranthesisMap = new HashMap<>();
        paranthesisMap.put('}', '{');
        paranthesisMap.put(']', '[');
        paranthesisMap.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(paranthesisMap.containsKey(c)){
                char top = stack.isEmpty()? '#': stack.pop();
                if(paranthesisMap.get(c) != top){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static int firstOccurrence(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
