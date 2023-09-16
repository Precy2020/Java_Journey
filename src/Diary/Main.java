package Diary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

import static java.lang.System.in;

public class Main {
    private static List<Diaries> diary = new ArrayList<>();
    private Scanner input = new Scanner(in);

    public static void main(String[] args) {
    }

    private static void input(){

    }

    private static void display(String message){


    }

    private static void mainMenu() {
        String mainMenu = "Welcome To La'Mour Diary" +
                "1. Open Diary" +
                "2. Create Entry" +
                "3. Exit" ;

        switch (mainMenu.charAt(0)){
            case 1 -> openDiary();
            case 2 -> createEntry();
            default -> exit();
        }

    }
    private static void openDiary() {

    }
    private static void createEntry() {

    }

    private static void exit() {
    }


}
