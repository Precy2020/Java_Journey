package deltel_deltel.chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int square = (int) Math.pow(number, 2);
        if (number > 100 && square > 100) {
            System.out.println("Greater than 100");
        }
        if (number == 100 && square == 100) {
            System.out.println("Equal 100");
        }
        if (number != 100 && square != 100) {
            System.out.println("Not Equal 100");
        }
        if (number < 100 && square < 100) {
            System.out.println("Less than 100");
        } else {
            System.out.println("Not found");
        }
    }
}
