package Projec1;

import java.util.Scanner;

public class Task6 {

    //6)Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {

        System.out.println("Please enter two number to swap");

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("your number: " + x + " " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Swap number: " + x + " " + y);

    }
}
