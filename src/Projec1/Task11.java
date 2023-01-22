package Projec1;

public class Task11 {
    //11)Write a program to print out duplicate elements from an Array of Strings? (edited)
    public static void main(String[] args) {

        String[] duplicate = {"France", "USA", "Canada", "Mexico", "USA", "China", "China"};

        for (int i = 0; i < duplicate.length - 1; i++) {
            for (int j = i + 1; j < duplicate.length; j++) {
                if ((duplicate[i].equals(duplicate[j])) && (i != j)) {
                    System.out.println("Duplicate Element are: " + duplicate[j]);
                }
            }
        }

    }
}
