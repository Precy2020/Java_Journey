package bank;

import java.util.Scanner;

public class MainClass {
    private static Bank lamourBank = new Bank();

    private static String write(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }

    private static void show(String message) {
        System.out.println(message);
    }

    public static void mainMenu(){
        String userOption = """
                ()()()()()()()()()()()()()()()()
                >>>Welcome to Lamour Bank :)<<<
                ()()()()()()()()()()()()()()()()
                1). Create Account.
                2). Deposit.
                3). Withdraw.
                4). Transfer.
                5). Balance
                6). Exit.
                ()()()()()()()()()()()()()()()()
                """;
        String userInput = write(userOption +"\n>>> ");
        switch (userInput.trim()){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> balance();
            case "6" -> exit();
            default -> {
                show(":( Invalid input please choose from the menu");
                mainMenu();
            }
        }
    }

    private static void balance() {
        String accountNumber = write("Put in your account number: ");
        String pin = write("Enter password: ");

        String balance = String.valueOf(lamourBank.getBalance(accountNumber, pin));
        show("Your balance is " + balance);
        mainMenu();
    }


    private static void createAccount() {
        String firstName = write("Enter your first name:> ");
        String lastName = write("Enter your last name:> ");
        String pin = write("Enter a prefer pin:> ");
        validate(firstName, lastName, pin);
        mainMenu();
    }

    private static void validate(String firstName, String lastName, String pin) {
        if(firstName.length() == 0 || firstName.matches("\\d+")){
            show("First name can not be empty or a digit!!!");
            mainMenu();
        }
        if (lastName.isEmpty() || lastName.matches("\\d+")){
            show("Last name can not be empty or a digit!!!");
            mainMenu();
        }
        if(pin.isEmpty() || pin.matches("^[a-zA-Z]*$")){
            show("Pin can not be empty or an Alphabet!!!");
            mainMenu();
        }
        else{
            lamourBank.register(firstName, lastName, pin);
            show("Welcome dear you are now our Customer :)!!!");
            show("AccountNumber: "+ lamourBank.generateAccountNumber());
            mainMenu();
        }
    }

    private static void transfer() {
        String from = write("Enter the sender's account number: ");
        String to = write("Enter the receiver's account number: ");
        String amount = write("How much: ");
        String pin = write("Enter sender's pin: ");
        lamourBank.bankCanTransfer(from, to, Integer.parseInt(amount), pin);
        mainMenu();
    }

    private static void deposit() {
        try{
        String accountNumber = write("Put in your account number: ");
        String amount = write("How much do you want to deposit?-> ");
        lamourBank.findAccount(accountNumber).deposit(Integer.parseInt(amount));
        show(amount +" deposited successfully!!");
        mainMenu();}
        catch (IllegalArgumentException e){
            show(e.getMessage());
        }
    }

    private static void withdraw() {
        try{
        String accountNumber = write("Put in your account number: ");
        String amount = write("How much do you want to withdraw?-> ");
        String pin = write("Put in your pin: ");
        lamourBank.findAccount(accountNumber).withdraw(Integer.parseInt(amount), pin);
        show("Money withdrawn successfully!");
        mainMenu();}
        catch (IllegalArgumentException e){
            show(e.getMessage());
        }
    }

    private static void exit() {
        System.exit(0);
    }
}


