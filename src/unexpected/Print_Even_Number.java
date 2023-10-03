package unexpected;

import java.util.Scanner;

public class Print_Even_Number {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int even = 0;
        for (int joy = 1; joy <= 10; joy++) {
            System.out.print(">>> ");
            int score = key.nextInt();
            if (score % 2 == 0) {
                System.out.println("Even Numbers: " + " " + score);

            }
        }

    }

}
