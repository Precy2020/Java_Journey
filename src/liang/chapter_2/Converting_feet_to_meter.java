package liang.chapter_2;
import java.util.Scanner;

public class Converting_feet_to_meter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of feet: ");
        double feet = scanner.nextDouble();

        double meter = feet * 0.305;
        System.out.println(feet + " " +"is" +" " +meter + " "+"meter");

    }
}
