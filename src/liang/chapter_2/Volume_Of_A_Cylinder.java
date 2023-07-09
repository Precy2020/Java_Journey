package liang.chapter_2;

import java.util.Scanner;

public class Volume_Of_A_Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + area + "\n" + "The volume is " + volume);












    }
}
