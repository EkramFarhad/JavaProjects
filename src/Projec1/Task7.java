package Projec1;

import java.util.Scanner;

public class Task7 {
    //)Write a java program to check whether a given number is prime or not?
    public static void main(String[] args) {
        System.out.println("Enter your number to Check if it is prime or not.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        }
        if (num >= 2) { // num =4
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    return;  // return to method and never comes back and execute the remaining statement
                    // break;  -  is used to terminate the current execution and come out of the loop
                }
            }
            System.out.println(num + " is a prime number");
        }
    }
}

//Easy way to find whole number
/*

public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i < Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
 */