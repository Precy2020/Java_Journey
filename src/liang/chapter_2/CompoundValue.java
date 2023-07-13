package liang.chapter_2;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
       int account_value = key.nextInt();

        double first_year  =  account_value * (1 + 0.00417);
        double second_year =  (account_value + first_year) * (1 + 0.00417);
        double third_year  =  (account_value + second_year) * (1 + 0.00417);
        double forth_year  =  (account_value + third_year) * (1 + 0.00417);
        double fifth_year  =  (account_value + forth_year) * (1 + 0.00417);
        double sixth_year  =  (account_value + fifth_year) * (1 + 0.00417);

        System.out.printf("After the sixth month, the account value is %.2f", sixth_year);






    }
}
