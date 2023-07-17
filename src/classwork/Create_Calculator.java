package classwork;

public class Create_Calculator {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 16;
        System.out.println(multiply(number1, number2));
        System.out.println(raise_to_power(number1, number2));
    }

    public static int multiply (int number1,  int number2){
        int total = 0;
        for (int num = 1; num <= number2;){
            total += number1;
            number1++;
        }
        System.out.println(total);
        return total;
    }
    public static int raise_to_power(int number1, int number2){
        int total = 0;
        for (; number1<= number2; number1++){
            total = multiply(number1, number2);
        }
        return total;
    }
}
