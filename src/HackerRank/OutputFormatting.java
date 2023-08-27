package HackerRank;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String string =input.next();
            int number  = input.nextInt();
            System.out.printf("%s\t\t%03d%n", string, number);
        }
        System.out.println("================================");

    }
}


