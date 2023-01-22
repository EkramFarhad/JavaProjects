package Projec1;

public class Task9 {
    //9)Maximum and minimum number in the array?
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 7, 9, 0, 12, 34, 56, 88,};

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min number " + min);
        System.out.println("Max number " + max);
    }
}
