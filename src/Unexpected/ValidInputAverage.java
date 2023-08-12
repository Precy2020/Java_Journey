package Unexpected;

import java.util.Scanner;

public class ValidInputAverage {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int average = 1;
        int sum = 0;
        for (int joy = 1; joy <= 10; joy++){
            System.out.print(">>> ");
            int score = key.nextInt();

            if (score >= 0 && score <= 100 ) {
                sum = score + sum;
                average = score / joy;
            }
            else{
                System.out.println("Invalid input");
            }

        }
        System.out.println("Sum: "+" "+sum);
        System.out.println("Average: "+" "+ average);
    }
}


