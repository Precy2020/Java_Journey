/* use a nested if statement to set each menu e.g. if input is equal to one print the submenu */
package training_ground.Snacks;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        String main_menu = ("Multiple Choice:\n"
                + "\t\t1. Phonebook\n"
                + "\t\t2. Message\n"
                + "\t\t3. Chat\n"
                + "\t\t4. Call register\n"
                + "\t\t5. Tone\n"
                + "\t\t6. Settings\n"
                + "\t\t7. Call divert\n"
                + "\t\t8. Games\n"
                + "\t\t9. Calculator\n"
                + "\t\t10. Reminders\n"
                + "\t\t11. Clock\n"
                + "\t\t12. Profiles\n"
                + "\t\t13. SIM services");
                 System.out.println(main_menu);
                 Scanner phone = new Scanner(System.in);
                System.out.println("Search for a menu: ");

                int menu_selection = phone.nextInt();



            if(menu_selection == 1){
            System.out.println("Phonebook;\n1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit.\n6. Assign tone.\n7. Send b'/card\n8. Options.\n9. Speed dials.\n10.Voice tags");
            }

            else if(menu_selection == 2){
            System.out.println("Message;\n1. Write messages.\n2.Inbox.\n3. Outbox.\n4. Picture messages.\n5. Templates.\n6. Smileys.\n7. Message settings");
            }

            else if(menu_selection == 3){
            System.out.println("Chat");
            }

            else if(menu_selection == 4){
            System.out.println("Call register;\n1. Missed calls\n2. Received calls\n3. Dialled numbers\n4.Erase recent call lists.\n5.Show calls duration.\n6.Show call costs\n7. Call cost settings.\n8. Prepaid credit.");
            }

            else if(menu_selection == 5){
            System.out.println("Tones;\n1. Ringing Tone.\n2. Ringing volume.\n3. Incoming call alert.4. Composer.\n5. Message alert tone.\n6. Keypad tones.\n7. Warning and game tones.\n8. Vibrating alert.\n9. Screen saver");
            }

            else if(menu_selection == 6){
            System.out.println("Settings\n1. Call settings.\n2. Phone settings.\n3. Security settings.\n4. Restore factory settings.\n");
            }

            else if(menu_selection == 7){
            System.out.println("Call divert");
            }

            else if(menu_selection == 8){
            System.out.println("Games");
            }

            else if(menu_selection == 9){
            System.out.println("Calculator");
            }

            else if(menu_selection == 10){
            System.out.println("Reminders");
            }

            else if(menu_selection == 11){
            System.out.println("Clock;\n1. Alarm clock.\n2. Clock settings.\n3. Date setting.\n4. Stopwatch.\n5. Countdown timer.\n6. Auto update of date and time.");
            }

            else if( menu_selection == 12){
            System.out.println("Profiles");
            }

            else if(menu_selection == 13){
            System.out.println("SIM services");
            }
    }

    public static void go_back() {


    }

    }






