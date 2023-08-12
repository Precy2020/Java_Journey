package Unexpected;

public class Sum_Of_The_Multiples_Of_8 {
    public static void main(String[] args) {

        int happy = 1;
        for (int joy = 8; joy <= 10; joy += 4) {
            for (int read = 1; read <= 5; read++) {
                happy *= joy;
            }

        }

        System.out.print(happy + " ");

    }
}
