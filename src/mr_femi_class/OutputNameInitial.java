package mr_femi_class;

import java.util.Scanner;

public class OutputNameInitial {



    private static String input(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }

    private static void display(String message) {
        System.out.println(message);
    }



    public static void outputNameInitial(){
       String name = input("Enter your name: ");

//        for (int characters = 0; characters < name.length(); characters++) {
//
//        }

    }
}
