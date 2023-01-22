package Projec1;

import java.util.Arrays;

public class Task10 {
    //0)Write a java program to find the second-largest number in the array?
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 7, 9, 12, 6666, 34, 56, 88, 908, 1000, 50, 7777, 88888};
        Arrays.sort(arr);
        int secondLarge = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > secondLarge)
                secondLarge = arr[i];
        }
        System.out.println(secondLarge + " is the second large number in the array.");

    }
}
