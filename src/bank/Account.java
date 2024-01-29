package bank;
public class Account {

    private int balance;
    private String pin;
    private String accountName;
    private String accountNumber;


    public String getAccountName() {
        return accountName;
    }

    public Account(String accountNumber, String accountName, String pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        setPin(pin);
    }

    public void deposit(int deposit) {
        if (deposit > 0) {
            balance += deposit;
        }
        else {
             throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }
    }

    public int getBalance(String pin) {
        if(this.pin.equals(pin)) return balance;
        else throw new IllegalArgumentException();

    }

    public void withdraw(int withdraw, String enteredPin) {
        if (isValidWithdrawal(withdraw) && isCorrectPin(enteredPin)) {
            if (balance >= withdraw) {
                balance -= withdraw;
            } else {
                throw new IllegalStateException("Insufficient funds for withdrawal");
            }
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount or incorrect PIN");
        }
    }

    private boolean isCorrectPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    private boolean isValidWithdrawal(int withdraw) {
        return withdraw > 0;
    }

    public void updatePin(String oldPin, String newPin) {
        if (isCorrectPin(oldPin)) {
            setPin(newPin);
        } else {
            throw new IllegalArgumentException("Incorrect Old Pin");
        }
    }

    private void setPin(String newPin) {
        if (newPin.length() == 4 && newPin.matches("\\d+")) {
            pin = newPin;
        } else {
            throw new IllegalArgumentException("Pin must be a 4-digit number");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccount() {
        return "Account{" +
                ", accountName='" + accountName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                "pin='" + pin + '\'' +
                '}';
    }
}
