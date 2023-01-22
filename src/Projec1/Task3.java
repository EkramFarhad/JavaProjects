package Projec1;

public class Task3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.

        int[][] num = {
                {4, 7, 9, 4},
                {8, 10, 26, 20},
                {5, 6, 7, 9}
        };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum = sum + num[i][j];
            }
        }
        System.out.println(sum);
    }
}
