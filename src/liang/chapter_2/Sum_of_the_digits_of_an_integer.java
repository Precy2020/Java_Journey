package liang.chapter_2;

import java.util.Scanner;

public class Sum_of_the_digits_of_an_integer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four digits: ");
        int digits = scanner.nextInt();
        
        int first_digit = digits / 1000;
        int second_digit = digits % 1000 / 100;
        int third_digit = digits % 1000 % 100 / 10;
        int forth_digit = digits % 1000 % 100 % 10;

        int sum = first_digit + second_digit + third_digit + forth_digit;
        System.out.println("The sum of the above digits is " + sum);

    }
}
