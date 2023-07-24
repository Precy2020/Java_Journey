package deltel_deltel.chapter_2;

import java.util.Scanner;

public class DiameterCircumferenceAreaOfACircle {
    public static void main(String[] args) {

        Scanner tired = new Scanner(System.in);
        System.out.println("Type in a number darling: ");
        int number = tired.nextInt();

        double diameter = 2 * number;
        double circumference = 2 * Math.PI * number;
        double area =  Math.PI * number * 2 * 2;

        System.out.printf("%f", diameter, circumference, area );







    }
}
