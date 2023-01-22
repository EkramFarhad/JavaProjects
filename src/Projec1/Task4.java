package Projec1;

public class Task4 {
    //4) Create a 2D array or integer type where you will store odd and even numbers.
    // Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {

        int[][] num = {
                {2, 4, 7, 9, 20},
                {5, 7, 8, 14, 26},
                {33, 46, 23, 16}
        };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if (i % 2 == 0) ;

                sum = sum + num[i][j];

            }
            System.out.println(sum + " ");

        }

    }
}
