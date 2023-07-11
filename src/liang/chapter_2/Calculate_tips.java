package liang.chapter_2;
import java.util.Scanner;

public class Calculate_tips {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = scanner.nextInt();
        double gratuity_rate = scanner.nextInt();
        double gratuity = gratuity_rate / subtotal;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is"+" "+gratuity+" "+"and the total is"+" "+total);

    }
}
