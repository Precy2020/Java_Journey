package unexpected;

public class Switch_sudoku {
    public static void main(String[] args) {

        String[][] switcher = {{"X","0","X"},{"0","0","X"},{"0","X","X"}};

        for (int index = 0; index < switcher.length; index++) {
            for (int index2 = 0; index2 < switcher.length; index2++) {
                 if(switcher[index][index2].equals("X")) switcher[index][index2] = "1";

                 System.out.print(switcher[index][index2]+ " ");
            }
            System.out.println();
        }
    }
}