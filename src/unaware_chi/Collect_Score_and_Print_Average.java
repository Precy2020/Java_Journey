package unaware_chi;

import java.util.Scanner;

public class Collect_Score_and_Print_Average {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int average = 1;
        int sum = 0;
        for (int joy = 1; joy <= 10; joy++){
            System.out.print(">>> ");
            int score = key.nextInt();
            sum = score + sum;
            average = score / average;
        }
        System.out.println("Sum: "+" "+sum);
        System.out.println("Average: " + " "+ average);
    }
}
