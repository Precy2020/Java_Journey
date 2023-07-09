package liang.chapter_2;

import java.util.Scanner;

public class Fahrenhit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = ((double) 9 / 5) * celsius + 32;

        System.out.println(celsius + " " + "Celsius"+ " "+fahrenheit + " "+ "Fahrenhit");


    }

}
