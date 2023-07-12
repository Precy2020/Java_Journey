package liang.chapter_2;
import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = key.nextDouble();
        double acceleration = key.nextDouble();

        double length = (Math.pow(speed, 2) / (2 * acceleration));

        System.out.printf("The minimum runway length for this airplane is %.3f", length);




    }
}
