package Projec1;

import java.util.Scanner;

public class Task1 {
    //1)Using Scanner create an array of integer values. After the array is created,
    // calculate the sum of all stored elements in that array.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter numbers");

        int[] num = new int[5];

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();

            sum = sum + num[i];

        }
        System.out.println(sum);


    }
}
