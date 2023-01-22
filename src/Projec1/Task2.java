package Projec1;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    // 2)Using Scanner create an array of countries. When an array is created, retrieve all values
    // from it and while retrieving those values print capital for each country. (use 2 different loops).
    public static void main(String[] args) {

        String[] countries = {"Afghanistan", "USA", "Turkish", "Iran"};
        String[] capitals = {"Kabul", "Washington", "Ankara", "Tehran"};
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < countries.length; i++) {

            System.out.print(countries[i] + " - ");

        }
        System.out.println();

        for (int j = 0; j < countries.length; j++) {

            System.out.println("Enter above countries names to check capitals");
            String capital = scan.next();

            if (countries[j].equals("Afghanistan")) {
                System.out.println(capitals[0]);
            } else if (countries[j].equals("USA")) {
                System.out.println(capitals[1]);                   // I couldn't do what I want.
            } else if (countries[j].equals("Turkish")) {
                System.out.println(capitals[2]);
            } else if (countries[j].equals("Iran")) {
                System.out.println(capitals[3]);
            } else {
                System.out.println("Invalid country");
            }
        }

    }
}
