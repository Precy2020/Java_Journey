package training_ground;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int [] inputCollector = receiveInput(4);
        int [] sort = sort(inputCollector);
        printMe(sort);
        input.close();

    }

    public static void printMe(int[] array){
        for (int index = 0; index < array.length; index++) {
            System.out.println("Element " + index + " content " + array[index]);
        }
    }


    public static int[] receiveInput(int capacity){
        int [] array = new int[capacity];
        System.out.println("Enter " + capacity + " integers: \r" );
        for (int numbers = 0; numbers < array.length; numbers++) {
            array[numbers] = input.nextInt();


        }
        return array;

    }



    public static int [] sort(int[] array){
        int[] sorted = new int[array.length];
        System.arraycopy(array, 0, sorted, 0, array.length);
        boolean indicate = true;
        int tempVariable;
        while (indicate){
            indicate = false;
            for (int numbers = 0; numbers < sorted.length - 1; numbers++) {
                if (sorted[numbers] < sorted[numbers + 1]){
                    tempVariable = sorted[numbers];
                    sorted[numbers] = sorted[numbers + 1];
                    sorted[numbers + 1] = tempVariable;
                    indicate = true;
                }
            }
        }
        return sorted;
    }
}
