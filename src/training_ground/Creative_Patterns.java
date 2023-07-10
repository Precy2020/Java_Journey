package training_ground;

public class Creative_Patterns {
    public static void main(String[] args) {

        myCorn(9);
    }

    public static void myCorn(int num){


        for(int row = 1; row <= num; row++){
            for(int column = 1; column <= row; column++) {
                System.out.print("# ");
            }
            for(int column = row; column <= num; column++){
                System.out.print(" ");
            }

            for(int column = row; column <= num; column++){
                System.out.print(" ");
            }

            for(int column = row; column <= num; column++){
                System.out.print("% ");
            }

            for(int column = 1; column <= row; column++){
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print(" ");
            }
            for(int column = row; column <= num; column++){
                System.out.print("& ");
            }
            for(int column = row; column <= num; column++){
                System.out.print(" ");
            }
            for(int column = row; column <= num; column++){
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print("$ ");
            }

            System.out.println();
        }




    }
}
