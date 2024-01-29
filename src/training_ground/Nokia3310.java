package training_ground;

import java.util.Scanner;




public class Nokia3310 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       offOn();
    }




        public static void offOn () {
        try {
            System.out.println("1. On");
            System.out.print(">>> ");
            int on = scanner.nextInt();
            if (on == 1) {
                menu_selection();
            } else {
                System.out.println("invalid input");
                offOn();
            }
        } catch (Exception exception){
            System.out.println("invalid!!! ");
        }
    }
        public static void mainMenu () {
        try {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("||||||||||||||||||||||||Nokia 3310|||||||||||||||||||||||||||||||||||||||");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Multiple Choice:\n1. Phonebook\n2. Message\n3. Chat\n4. Call register\n5. Tone\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM services\n0. Exit");
        System.out.println("Make your selection: ");
        int validInput = scanner.nextInt();
        if (validInput == 1) {
            phonebook();
        }

        if (validInput == 2) {
            message();
        }

        if (validInput == 3) {
            chat();
        }

        if (validInput == 4) {
            call_register();
        }

        if (validInput == 5) {
            tone();
        }

        if (validInput == 6) {
            settings();
        }

        if (validInput == 7) {
            call_divert();
        }
        if (validInput == 8) {
            game();
        }

        if (validInput == 9) {
            calculator();
        }

        if (validInput == 10) {
            reminders();
        }

        if (validInput == 11) {
            clock();
        }

        if (validInput == 12) {
            profiles();
        }

        if (validInput == 13) {
            sim_services();
        }
        if (validInput == 0) {
            System.exit(0);
        }
        } catch (Exception exception){
            System.out.println("Invalid!!");
        }
    }


    public static void menu_selection() {
            mainMenu();

    }

    public static void phonebook() {
        try {
            System.out.println("Phonebook:\n1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit.\n6. Assign tone.\n7. Send b'/card\n8. Options.>>\n9. Speed dials.\n10.Voice tags");
            System.out.println("Press 8 for more options: ");
            int prompt = scanner.nextInt();
            if (prompt == 8) {
                System.out.println("1. Type of view\n2. Memory status");
            }
            if (prompt == 0) {
                menu_selection();
            }
            System.out.println("press any digit to go back");
            int back = scanner.nextInt();
            if (back > 0 || back == 0) {
                phonebook();
            }
        } catch (Exception exception){
            System.out.println("Not valid");
        }
    }

    public static void message() {
        System.out.println("Message;\n1. Write messages.\n2.Inbox.\n3. Outbox.\n4. Picture messages.\n5. Templates.\n6. Smileys.\n7. Message settings>>");
        System.out.println("press 7 for more options: ");
        int message = scanner.nextInt();
        if(message == 7){
            message_7();
        }
        menu_selection();
    }
    public static void message_7(){
        System.out.println("1. Sets>>\n 2. Common>>");
        System.out.println("choose from option: ");
        int seven = scanner.nextInt();
        if(seven == 1){
            System.out.println("1. Message centre number\n2. Messages sent as\n3. Message validity");
            message_7();
        }
        if(seven == 2){
            System.out.println("1. Delivery reports\n2. Reply via same centre\n3. Character support");
            message_7();
        }
        if(seven == 0){
            message();
        }
        if(seven < 0 || seven > 2){
            System.out.println("Invalid input!");
            message_7();
        }
    }

    public static void chat() {
        System.out.println("Chat;\n1. New chat\n2.Reply\n3. Delete chat ");
        System.out.println("Press 00 to go back to main menu: ");
        int chat = scanner.nextInt();
        if(chat == 0) {
            menu_selection();
        }
    }

    public static void call_register() {
        System.out.println("Call register;\n1. Missed calls\n2. Received calls\n3. Dialled numbers\n4.Erase recent call lists.\n5.Show calls duration.\n6.Show call costs\n7. Call cost settings.\n8. Prepaid credit.");
        System.out.println("press 00 to go back to main menu: ");
        int register = scanner.nextInt();
        if (register == 0) {
            menu_selection();
        }
    }

    public static void tone() {
        System.out.println("Tones;\n1. Ringing Tone.\n2. Ringing volume.\n3. Incoming call alert.4. Composer.\n5. Message alert tone.\n6. Keypad tones.\n7. Warning and game tones.\n8. Vibrating alert.\n9. Screen saver");
        System.out.println("press 00 to go back to main menu: ");
        int tone = scanner.nextInt();
        if(tone == 0) {
            menu_selection();
        }
    }

    public static void settings() {
        System.out.println("Settings\n1. Call settings.>>\n2. Phone settings.>>\n3. Security settings.>>\n4. Restore factory settings.>>\n");
        int input  = scanner.nextInt();
        if (input == 1){
            System.out.println("Call settings;\n1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer");
        }
        if (input == 2){
            System.out.println("Phone settings;\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights2\n6. Confirm SIM service actions");
        }
        if (input == 3){
            System.out.println("Security settings;\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4. Closed user group\n5. Phone security\n6. Change access codes");
        }
        if (input == 4){
            System.out.println("Restore factory settings");
        }
        if (input < 0 || input > 4){
            System.out.println("invalid input");
            settings();
        }
        if (input == 0){
            menu_selection();
        }

        System.out.println("press any button to go back");
        System.out.print("press 0 to go back: ");
        int me = scanner.nextInt();
        if (me > 0 || me == 0){
            settings();
        }


    }

    public static void call_divert() {
        System.out.println("Call divert");
        System.out.println("press 00 to go back to main menu: ");
        int divert = scanner.nextInt();
        if(divert == 0) {
            menu_selection();
        }
    }

    public static void game() {
        System.out.println("Games");
        System.out.println("press 00 to go back to main menu: ");
        int game = scanner.nextInt();
        if (game == 0) {
            menu_selection();
        }
    }

    public static void calculator() {
        System.out.println("Calculator");
        System.out.println("press 00 to go back to main menu: ");
        int calculator = scanner.nextInt();
        if(calculator == 0){
            menu_selection();
        }
    }

    public static void reminders() {
        System.out.println("Reminders");
        System.out.println("press 00 to go back to main menu: ");
        int reminder = scanner.nextInt();
        if (reminder == 0) {
            menu_selection();
        }
    }

    public static void clock() {
        System.out.println("Clock;\n1. Alarm clock.\n2. Clock settings.\n3. Date setting.\n4. Stopwatch.\n5. Countdown timer.\n6. Auto update of date and time.");
        System.out.println("press 00 to go back to main menu: ");
        int clock = scanner.nextInt();
        if(clock == 0) {
            menu_selection();
        }
    }

    public static void profiles() {
        System.out.println("Profiles");
        System.out.println("press 00 to go back to main menu: ");
        int profiles = scanner.nextInt();
        if(profiles == 0) {
            menu_selection();
        }
    }

    public static void sim_services() {
        System.out.println("SIM services");
        System.out.println("press 00 to go back to main menu: ");
        int sim = scanner.nextInt();
        if(sim == 0) {
            menu_selection();
        }
    }

}