package Bank;

import java.util.ArrayList;

public class Bank {
   private ArrayList<Account>accounts = new ArrayList<>();
   public void register(String firstName, String lastName, String pin) {
        Account account = new Account(pin, firstName + " "+ lastName, generateAccountNumber());
        accounts.add(account);

    }

    public String generateAccountNumber() {
        return accounts.size() + 1 + "";
    }

    public void findAccount() {
        for (Account search: accounts) {
            search.accountNumber();
        }

    }


//    public String getRegister() {
//
//    }
}
