package Unexpected;

public class Echo {
    public static void main(String[] args) {
        for (int joy = 1; joy <= 10; joy++) {
            for (int peace = joy; peace <= 7; peace++) {
                if (peace % 4 == 0) {
                    System.out.print(peace + " ");
                }
            }
        }

        for (int joy = 4; joy <= 10; joy++) {
            for (int peace = joy; peace <= 8; peace++) {
                if (peace % 8 == 0) {
                    System.out.print(peace + " ");
                }
            }
        }


    }
}
