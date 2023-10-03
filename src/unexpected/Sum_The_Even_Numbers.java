package unexpected;

import java.util.Scanner;

public class Sum_The_Even_Numbers {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int sum = 0;
        for (int joy = 1; joy <= 10; joy++) {
            System.out.print(">>> ");
            int score = key.nextInt();
            if (score % 2 == 0) {
                sum = score + sum;
            }
        }
        System.out.println("Sum: " + " " + sum);

        }
    }


