package hacker_rank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        for (int number = 0; number <= userInput; number++) {
            int first = input.nextInt();
            int second = input.nextInt();
            int third = input.nextInt();

            for (int i = 0; i < third; i++) {
                int sequence = first + 1 * second;
                System.out.println(sequence);
            }
        }

    }
}
