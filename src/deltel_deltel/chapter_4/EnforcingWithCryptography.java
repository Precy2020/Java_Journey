package deltel_deltel.chapter_4;

import java.util.Scanner;

public class EnforcingWithCryptography {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println(">> ");
        int number = key.nextInt();

        int a = number / 1000;
        int b = number % 1000 / 100;
        int c = number % 1000 % 100 / 10;
        int d = number % 1000 % 100 % 10 / 1;

        int first = a + 7;
        int second = b + 7;
        int third = c + 7;
        int fourth = d + 7;
        System.out.println(first + " " + second + " " + third + " " + fourth);
        int set1 = first % 10;
        int set2 = second % 10;
        int set3 = third % 10;
        int set4 = fourth % 10;
        System.out.println(set1+ " " + set2  + " " + set3 + " " + set4);


        System.out.println(set3 + " " + set4 + " " + set1 + " " + set2
        );




    }
}
