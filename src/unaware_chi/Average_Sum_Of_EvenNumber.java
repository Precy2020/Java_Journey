package unaware_chi;

import java.util.Scanner;

public class Average_Sum_Of_EvenNumber {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int average = 1;
        int sum = 0;
        for (int peace = 1; peace <= 10; peace++) {
            System.out.print(">>> ");
            int score = key.nextInt();
            if (peace % 2 == 0) {
                sum = score + sum;
                average = peace / average;
            }
        }
        System.out.println("Sum: " + " " + sum);
        System.out.println("Average: " + " " + average);
    }
}








