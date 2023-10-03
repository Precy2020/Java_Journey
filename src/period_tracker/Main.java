package period_tracker;

import java.util.Scanner;

public class Main {
    private static MenstrualApp menstrualApp = new MenstrualApp();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void show(String message) {
        System.out.println(message);
    }

    private static String write(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();
    }

    private static void mainMenu() {
        String userOption = """
                               |+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|
                               Welcome to Lamour Period Tracker!!! :)
                               What would you like us to do for you?
                               1~ Check next flow date?
                               2~ Check ovulation date?
                               3~ Check next safe date?
                               4~ Exit App?
                               |+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|
                               """;
        String userResponse = write(userOption + "\nEnter: ");
        switch (userResponse.trim()) {
            case "1" -> nextFlowDate();
            case "2" -> nextOvulationDate();
            case "3" -> safeDate();
            case "4" -> exit();
            default -> {
                show(":( Invalid input please choose a number from the option!");
                mainMenu();
            }
        }
    }

    private static void nextFlowDate() {
        try{
        String lastPeriod = write("What date did your last period start? (yy-MM-dd): ");
        String menstrualCycle = write("How many days is your menstrual cycle?: ");
        show("Your next flow date is "+menstrualApp.checkNextFlowDate(lastPeriod, Integer.parseInt(menstrualCycle)));

            mainMenu();
        } catch (IllegalArgumentException e){
            show(e.getMessage());
            mainMenu();
        }

    }

    private static void nextOvulationDate() {
        try {
            String lastPeriod = write("What date did your last period start? (yy-MM-dd): ");
            String menstrualCycle = write("How many days is your menstrual cycle?: ");
            show("Your next ovulation date is " +menstrualApp.ovulationDate(lastPeriod, Integer.parseInt(menstrualCycle)));

        } catch (IllegalArgumentException e) {
           show(e.getMessage());
           mainMenu();
        }

        mainMenu();
    }

    private static void safeDate() {
        try {
            String lastPeriod = write("What date did your last period start? (yy-MM-dd): ");
            String menstrualCycle = write("How many days is your menstrual cycle?: ");
            show("Your next safe date is "+menstrualApp.nextSafeDate(lastPeriod, Integer.parseInt(menstrualCycle)));
        } catch (IllegalArgumentException e) {
            show(e.getMessage());
            mainMenu();
        }
        mainMenu();
    }

    private static void exit() {
        System.exit(0);
    }
}
