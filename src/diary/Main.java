package diary;

import java.util.Scanner;
import java.lang.*;


public class Main {
    private static Diaries diaries = new Diaries();
    private static Diary journal;

    public static void main(String[] args) {
        mainMenu();
    }

    private static String write(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }

    private static void show(String message) {
        System.out.println(message);
    }

    public static void mainMenu() {
        String mainMenu = """
                            )(=)(=)(=)(=)(=)(=)(=)(
                            A Beautiful Day to you :)
                            Welcome to La'mour diary
                            
                            <1> Open diary
                            <2> Login
                            <3> Exit
                            
                            )(=)(=)(=)(=)(=)(=)(=)(
                            """;
        String userResponse = write(mainMenu +"\n>> ");
        switch (userResponse.charAt(0)) {
            case '1' -> openDiary();
            case '2' -> login();
            case '3' -> exit();
            default -> System.exit(1);
        }
    }

    private static void openDiary() {
        String username = write("Put in Your Username -> ");
        String password = write("Put in Your Password -> ");
        validates(username, password);
    }

    private static void validates(String username, String password) {
        if (username.length() < 6) {
            show("Username must be six characters or more than");
        }
        if (password.length() < 6) {
            show("Password must be six characters or more than");
        } else {
            diaries.add(username, password);
            show("Congrats " + username + " :) you just got registered successfully!");
            show("Your id is " + diaries.generateId());
            userMenu();
        }
    }

    private static void login() {
        try {
            String username = write("Enter your Username:= ");
            String password = write("Enter your Password:= ");
            valid(username, password);
        }
        catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static void valid(String username, String password) {
        if (journal != null && journal.getUsername().equals(username) && journal.getPassword().equals(password)) {
            show("Hello " + journal.getUsername() + " great to have you back here :)");
            userMenu();
        } else {
            show(":( Username or Password not found!");
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void userMenu() {
        String memberMenu = """
                                 |o|o|o|o|o|o|o|o|o|o|
                                 1_ Gist us
                                 2_ Find your gist
                                 3_ Delete your gist
                                 4_ Add to gist
                                 5_ Exit
                                 |o|o|o|o|o|o|o|o|o|o|
                                """;
        String userResponse = write(memberMenu);
        switch (userResponse.charAt(0)) {
            case '1' -> gistUs();
            case '2' -> findYourGist();
            case '3' -> deleteYourGist();
            case '4' -> addToGist();
            case '5' -> exit();
            default -> userMenu();
        }
    }

    private static void gistUs() {
        try{
        String title = write("What's the title-> ");
        String body = write("What the gist-> ");
        validate(title, body);}
        catch(NullPointerException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static void validate(String title, String body) {
        if (title.length() < 6) {
            show("Title must be six characters or more than");
            gistUs();
        }
        if (body.length() < 6) {
            show("Body must be six characters or more than");
            gistUs();
        } else {
            journal.createEntry(title, body);
        }
    }

    private static void findYourGist() {
        try{
        String id = write("Put in your ID: ");
        String username = write("Put in your username: ");
        if (!id.matches("[0-9]+")) {
            show("Invalid Id");
            findYourGist();
        } else {
            show(diaries.findByUsername(username).findEntryById(Integer.parseInt(id)).toString());
            userMenu();
        }}
        catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static void deleteYourGist() {
        try{
        String id = write("Put in your ID: ");
        String username = write("Put in username: ");
        String password = write("Put in your password: ");
        if (journal != null) {
            journal.deleteEntry(Integer.parseInt(id));
        }
        diaries.deleteDiary(username, password);}
        catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static void addToGist() {
        String id = write("Put in your ID: ");
        String title = write("What is the Title of your new gist: ");
        String body = write("Gist us: ");
        if (journal != null) {
            journal.updateEntry(Integer.parseInt(id), title, body);
        }
    }
}
