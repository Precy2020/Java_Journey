package assignments.tdd;

public class Account {


    private String pin;
    private int balance;

    public Account(int pin) {

    }



    public int getBalance()
    {
        return balance;

    }

    public int deposit(int amount, int pin)
    {
        if (balance > 0) {return balance;}
        balance += amount;
        return amount;


    }
    


    public void withdraw(int amount)
    {
        balance -= amount;

    }


}
