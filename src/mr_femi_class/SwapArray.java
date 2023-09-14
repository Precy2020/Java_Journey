package mr_femi_class;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        swapArray(input.nextInt(), input.nextInt());
        input.close();
    }


    public static void swapArray(int firstIndex, int secondIndex){
        int [] array = {5, 2, 6, 10, 9, 3};
        int container;
        container = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = container;
        System.out.println(Arrays.toString(array));
    }


}
