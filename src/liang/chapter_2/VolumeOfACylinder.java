package liang.chapter_2;

import java.util.Scanner;

public class VolumeOfACylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.printf("%s %4f %n %s %4f","The area is ", area, "The volume is ", volume);


    }
}
