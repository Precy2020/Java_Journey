package liang.chapter_2;
import java.util.Scanner;

public class Numbers_of_years {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minute: ");
        double minute = input.nextDouble();
         int years = (int)minute / 525600;
         int days = ((int)minute % 525600) / 1440;
        System.out.printf("%.0f minutes minutes is approximately %d years and %d days", minute, years, days);





















    }
}
