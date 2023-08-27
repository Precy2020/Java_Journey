package deltel_deltel.chapter2;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = input.nextInt();
        System.out.printf("Diameter is: %d %n ", 2 * radius);
        System.out.printf("Circumference is: %2f %n", 2 * Math.PI * radius);
        System.out.printf("Area is: %2f", Math.PI * radius * 2);
        
    }
}
