package liang.chapter_3;
import java.util.Scanner;

public class ComparePrice {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight_1 = key.nextDouble();
        double price_1 = key.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight_2 = key.nextDouble();
        double price_2 = key.nextDouble();

        double package1 = weight_1 / price_1;
        double package2 = weight_2 / price_2;

        if (package1 > package2){
            System.out.println("Package 1 has a better price");
        }
        else {
            System.out.println("Package 2 has a better price");
        }


    }
}
