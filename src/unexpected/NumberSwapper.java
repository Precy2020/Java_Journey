package unexpected;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberSwapper{
    private int[] number;
    private ArrayList<String> newSet2 = new ArrayList<>();

    public static void main(String[] args) {
        NumberSwapper numberSwapper = new NumberSwapper();
        System.out.println(Arrays.toString(numberSwapper.number));
        //System.out.println(Arrays.toString(numberSwapper.oodNumbers(new int[]{22, 41, 15, 8, 2, 1})));
        System.out.println(Arrays.toString(numberSwapper.swapNumber2(new int[]{22, 41, 15, 9, 2, 1})));
    }




    public int[] swapNumber1(int[] number1){
        for (int index = 0; index < number1.length; index++) {

            if (index % 2 != 0){
                int swap;
                swap = number1[index - 1];
                number1[index - 1] = number1[index];
                number1[index] = swap;
            }
        }
       return number1;
    }

    public int[] swapNumber2(int[] number2){
        for (int index = 0; index < number2.length; index++) {
            if (index % 2 > 0){
                if(number2[index] % 2 > 0 && number2[index - 1] % 2 > 0){
                    int swapNumber;
                    swapNumber = number2[index - 1];
                    number2[index - 1] = number2[index];
                    number2[index] = swapNumber;
                }
            }
        }
        return number2;
    }

    public int[] swapNumber3(){
        int newSet;
        for ( int index = 0;index < number.length / 2; index++) {
            newSet = number[(number.length - 1) - index];
            number[(number.length - 1) - index] = number[index];
            number[index] = newSet;


        }
        return number;
    }
    public ArrayList<String> oodNumbers(int[] number4) {

        for (int index = 0; index < number4.length; index++) {
            if (number4[index] % 2 > 0) {
                newSet2.add(String.valueOf(number4[index]));
            }
        }
        return newSet2;
    }

    }