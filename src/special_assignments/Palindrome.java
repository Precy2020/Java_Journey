package special_assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(12345678));

    }

//    public static boolean palindrome (String letter){
//        boolean check = false;
//        String peace = " ";
//        for (int counter = letter.length()-1; counter >= 0; counter--){
//            char newChar = letter.charAt(counter);
//            peace += newChar;
//
//            if(letter.equals(peace)) check = true;
//        }
//        return check;
//
//    }

    public static boolean palindrome (int letters){
        boolean check = false;
        String letter = letters + "";

        String peace = "";
        for (int counter = letter.length()-1; counter >= 0; counter--){
            char newChar = letter.charAt(counter);
            peace += newChar;
            if (letter.equals(peace)) check = true;

        }
        return check;

    }
}
