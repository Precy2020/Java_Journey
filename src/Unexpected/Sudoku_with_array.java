package Unexpected;

public class Sudoku_with_array {
    public static void main(String[] args) {

//        Character[][] character = {{'X','0','X'},{'0', '0', 'X'}, {'0', 'X', 'X'}};
//        for (int index = 0; index < character.length; index++) {
//            for (int index2 = 0; index2 < character.length; index2++) {
//                System.out.print(character[index][index2] + " ");
//            }
//            System.out.println();
//        }
//
//
//        String[][] character2 = {{"x","o","x"},{"o","o","x"},{"o","x","x"}};
//
//        for (int index = 0; index < character2.length; index++) {
//            for (int index2 = 0; index2 < character2.length; index2++) {
//                System.out.print(character2[index][index2]+ " ");
//            }
//            System.out.println();
//        }
        String[][] character2 = {{"x","o","x"},{"o","o","x"},{"o","x","x"}};
        String a = character2[0][0] = "X";
        String b = character2[0][1] = "0";
        String c = character2[0][2] = "X";
        System.out.println(a + " " +b+ " "+c);

        String d = character2[0][0] = "0";
        String e = character2[0][1] = "0";
        String f = character2[0][2] = "X";
        System.out.println(d + " " +e+ " "+f);

        String g = character2[0][0] = "X";
        String h = character2[0][1] = "0";
        String i = character2[0][2] = "X";
        System.out.println(g + " " +h+ " "+i);












    }
}
