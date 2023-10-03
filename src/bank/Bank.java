package bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public String register(String firstName, String lastName, String pin) {
        String accountNumber = generateAccountNumber();
        Account account = new Account(accountNumber,firstName + " " + lastName, pin);
        accounts.add(account);
        return accountNumber;
    }

    public String generateAccountNumber() {
        return accounts.size() + 1 + "";
    }

    public Account findAccount(String accountNumber) {
        for (Account search : accounts) {
            if (search.getAccountNumber().equals(accountNumber)){
                return search;}
        }
        throw new IllegalArgumentException("Invalid account");
    }

    public void canDeposit(String accountNumber, int deposit) {
        findAccount(accountNumber).deposit(deposit);
    }

    public int getBalance(String accountNumber) {
        return findAccount(accountNumber).getBalance();
    }

    public void canWithdraw(String accountNumber, int withdraw, String pin) {
        findAccount(accountNumber).withdraw(withdraw, pin);
    }

    public void bankCanTransfer(String sourceAccountNumber, String destinationAccountNumber, int amount, String pin) {
        try {
            Account sourceAccount = findAccount(sourceAccountNumber);
            Account destinationAccount = findAccount(destinationAccountNumber);

            if (sourceAccount == null || destinationAccount == null) {
                throw new IllegalArgumentException("Invalid source or destination account number");
            }

            if (sourceAccount.getBalance() < amount) {
                throw new IllegalArgumentException("Insufficient funds for the transfer");
            }

            sourceAccount.withdraw(amount, pin);
            destinationAccount.deposit(amount);
            System.out.println("Transfer successful");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
