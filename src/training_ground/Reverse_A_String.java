package training_ground;

import java.util.Scanner;

public class Reverse_A_String {
    public static void main(String[] args) {

        Scanner key =  new Scanner(System.in);
        System.out.print(">>>> ");
        String letter = key.next();
        StringBuilder peace = new StringBuilder(" ");
        for (int counter = letter.length()-1; counter >= 0; counter--){
            peace.append(letter.charAt(counter));
        }

        System.out.println(">>> " + peace);




























    }
}
