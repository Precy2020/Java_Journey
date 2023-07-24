package classwork;

public class MethodThatReturnsUniqueCharacters {
    public static void main(String[] args) {

        returns_special_characters("=, j, h, h, h, i, i, i, i");
    }

    public static void returns_special_characters(String numbers) {
        for (int index = 0; index < numbers.length(); index++) {

        }

            if (numbers.equals("#")) {
                System.out.println("True");
            }
            if (numbers.equals("$")) {
                System.out.println("True");
            }
            if (numbers.equals("_")) {
                System.out.println("True");
            }
            if (numbers.equals("-")) {
                System.out.println("True");
            }
            if (numbers.equals(":")) {
                System.out.println("True");
            }
            if (numbers.equals(";")) {
                System.out.println("True");
            }
            if (numbers.equals("=")) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
    }
}
