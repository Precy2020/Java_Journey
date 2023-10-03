package phonebook;

import java.util.Scanner;

public class Main {


    private static void show(String message) {
        System.out.println(message);
    }

    private static String write(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
}
