package deltel_deltel.chapter_2;

import java.util.Scanner;

public class Separating_Integer_Digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(">>> ");
        int presh = scanner.nextInt();

        int a = presh / 10000;
        int b = presh % 10000 / 1000;
        int c = presh % 10000 % 1000 / 100;
        int d = presh % 10000 % 1000 % 100 / 10;
        int e = presh % 10000 % 1000 % 100 % 10;


        System.out.println(a + " "+ b + " "+ c + " "+ d + " "+ e);




    }
}
