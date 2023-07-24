package special_assignments;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
credit_card();
    }
 public static  void credit_card(){
     Scanner key = new Scanner(System.in);
     System.out.print("Hi there!! Please kindly enter card number: ");
     long [] input = {key.nextLong()};
     for (long index = 0; index < input.length; index++){
         long multiply = input[0] * input[(int) index];
         System.out.println(multiply);}



 }
}
