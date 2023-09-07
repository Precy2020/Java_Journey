package HackerRank;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String string =input.next();
            int number  = input.nextInt();
            System.out.printf("%-15s", string);
            System.out.printf("%03d%n", number );
        }
        System.out.println("================================");

    }
}


