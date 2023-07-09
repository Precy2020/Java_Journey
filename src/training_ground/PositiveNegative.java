package training_ground;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("input a number: ");
        int peace = scanner.nextInt();

        int total = 0;
        int num2 = 0;
        int number1 = 0;
        int counter = 0;
        while (peace != 0) {
            counter++;

            if (peace > 0) {
                num2++;
            }
            if (peace < 0) {
                number1++;
            }
            peace = scanner.nextInt();
            total = peace++;

        }

            System.out.println("Positive numbers are: " + num2 + " Negative numbers are: " + number1);
            System.out.println("Total: " + total);


    }

}
