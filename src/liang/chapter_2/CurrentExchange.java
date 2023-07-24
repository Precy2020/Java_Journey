package liang.chapter_2;

import java.util.Scanner;

public class CurrentExchange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchange_rate =  input.nextDouble();
        System.out.println("Enter 0 to covert RMB to dollar and any number vice versa: ");
        int choice = input.nextInt();


        if (choice == 0){
            System.out.println("Enter dollar amount: ");
            double dollar_amount = input.nextDouble();
            double rmb =  exchange_rate * dollar_amount;
            System.out.println("$"+dollar_amount+" "+"is"+" "+rmb+"yuan");

        }
        else {
            System.out.println("Enter RMB amount: ");
            double rmb_amount = input.nextDouble();
            double dollar = rmb_amount / exchange_rate;
            System.out.printf("%.1fyuan is $%.2f",rmb_amount,dollar);
        }


















    }
}
