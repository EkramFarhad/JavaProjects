package Projec1;

public class Task8 {
    //8)Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {

        System.out.println("print the Fibonacci sequence");

        int n = 10;
        int f = 1, s = 1, t;
        System.out.println(f);
        System.out.println(s);
        for (int i = 3; i <= n; i++) {
            t = f + s;
            System.out.println(t);
            f = s;
            s = t;
        }
    }
}
