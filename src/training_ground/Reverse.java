package training_ground;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner key =  new Scanner(System.in);
        System.out.print(">>>> ");
        String letter = key.next();
        StringBuilder peace = new StringBuilder(" ");
        for (int joy = letter.length()-1; joy >= 0; joy--){
            peace.append(letter.charAt(joy));
        }
        System.out.println(">>> " + peace);




























    }
}
