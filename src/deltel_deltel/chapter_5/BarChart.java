package deltel_deltel.chapter_5;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>> ");
        int number = input.nextInt();
        for(; number <= 5; number++ ){
             number++;
        }
        System.out.println("*".repeat(number));

    }
}
