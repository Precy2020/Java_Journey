package Bank;

import java.util.ArrayList;

public class Bank {
   private ArrayList<Account>accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void register(String firstName, String lastName, String pin) {
        Account account = new Account(firstName + " "+ lastName, generateAccountNumber(),pin);
        accounts.add(account);
    }

    public String generateAccountNumber() {
        return String.valueOf(accounts.size()+1);
    }

    public Account findAccount(String accountNumber){
        for (Account search :
                accounts) {
            if (search.getAccountNumber().equals(accountNumber))
                return search;
        }
        return null;
    }

    public void canDeposit(String accountNumber, int deposit) {
        findAccount(accountNumber).deposit(deposit);
    }

    public int getBalance(String accountNumber){
        return findAccount(accountNumber).getBalance();
    }

    public void canWithdraw(String accountNumber, int withdraw, String pin){
        findAccount(accountNumber).withdraw(withdraw, pin);
    }

    public void bankCanTransfer(){

    }

}
