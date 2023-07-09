package training_ground;

public class RoasteredCorn {
    public static void main(String[] args) {

        int[][] picture = {{0, 0, 0, 1, 0, 0, 0},
                           {0, 0, 1, 1, 1, 0, 0},
                           {0, 1, 1, 1, 1, 1, 0},
                           {1, 1, 1, 1, 1, 1, 1},
                           {0, 0, 0, 1, 0, 0, 0},
                           {0, 0, 0, 1, 0, 0, 0},
                           {0, 0, 0, 1, 0, 0, 0},
                           {0, 0, 0, 1, 0, 0, 0}, };

       for(int j = 0; j < picture.length; j++){System.out.println(" ");
           for(int p = 0; p < picture[j].length; p++){
               if (picture[j][p] == 1){
                   System.out.print("*");
               }
               if (picture[j][p] == 0){
                   System.out.print(" ");
               }
           }


        }


    }
}
