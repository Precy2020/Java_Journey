package training_ground;

import java.util.Scanner;

public class Account {

//    private boolean account;
//    private long amount;
//    private long balance;
//    private long total;
//
//    public void setAccount() {
//    }
//
//    public boolean getAccount() {
//        return true;
//    }
//
//    public void setBalance(int amount) {
//        this.amount = amount;
//    }
//
//    public long getBalance() {
//        return amount;
//    }
//
//    public void setTotal(int total) {
//        this.total = total;
//    }
//
//    public long getTotal() {
//        return total;
//    }
//
//    public void setOverall() {
//
//    }

    public static void main(String[] args) {
        Account account = new Account();

        Scanner key = new Scanner(System.in);

        System.out.println("Enter your account Number: ");
        int accountNumber = key.nextInt();

        while (accountNumber != -1){
            accountNumber++;
            System.out.println("Enter balance: ");
            int balance = key.nextInt();
            int charges = key.nextInt();
            int credit = key.nextInt();
            int creditLimit = key.nextInt();
            System.out.println(account.creditCalculator(accountNumber, balance, charges, credit, creditLimit));


        }
    }

    public int creditCalculator(int accountNumber, int balance, int charges, int credit, int creditLimit) {

        int newBalance = balance + credit - charges;
        return newBalance;
    }
}
