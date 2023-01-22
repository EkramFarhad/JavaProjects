package Projec1;

public class Task5 {

    //5)Create a 2D array of integers.
    // Develop a program which will calculate the sum of  even and odd numbers for that array.

    public static void main(String[] args) {

        int[][] num = {
                {13, 46, 45, 34,},
                {33, 56, 34, 548},
                {24, 35, 67, 57}
        };
        int sum =0;
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {

                sum = sum + num[i][j];
            }
            System.out.println(sum);

        }

    }
}
