package Bank;

public class Account {

    private int balance;
    private String pin;
    private String accountName;
    private String accountNumber;

    public Account(String accountName,String accountNumber,String pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public void deposit(int deposit) {
        if (deposit > 0)
            balance+=deposit;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int withdraw, String pin) {
        if (isValidWithdrawal(withdraw,pin))
            if (isCorrectPin(pin))
                balance = balance - withdraw;
    }

    private boolean isCorrectPin(String pin){
        if (this.pin.equals(pin)) return true;
        else {
            throw new IllegalArgumentException("Incorrect Pin");}
    }

    private boolean isValidWithdrawal(int withdraw, String pin){
            return balance >= withdraw;
    }

    public void updatePin(String oldPin, String newPin){
        if (isCorrectPin(oldPin))
            pin = newPin;
    }

    public void accountNumber() {
        
    }
}
