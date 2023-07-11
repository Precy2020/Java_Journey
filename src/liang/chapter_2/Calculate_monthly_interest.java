package liang.chapter_2;

import java.util.Scanner;

public class Calculate_monthly_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the balance and interest rate: ");
        double balance = input.nextDouble();
        double interest_rate = input.nextDouble();

        double interest = balance * (interest_rate / 1200);
        System.out.printf("The interest for the next month is %.5f", interest);
    }
}
