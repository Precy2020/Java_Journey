package training_ground;

public class Mama {
    public static void main(String[] args) {

        int num = 9;

        for(int row = 1; row <= num; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
