package unaware_chi;

import java.util.Scanner;

public class Add_Sum_and_Average_of_Score {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int average = 1;
        int sum = 0;
        for (int peace = 1; peace <= 10; peace++) {
            System.out.print(">>> ");
            int score = key.nextInt();

            sum = score + sum;
            average = sum / average;

        }
        System.out.println("Sum: " + " " + sum);
        System.out.println("Average: " + " " + average);
    }
}

