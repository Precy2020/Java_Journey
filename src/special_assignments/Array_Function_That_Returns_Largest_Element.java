package special_assignments;



public class Array_Function_That_Returns_Largest_Element {

    public static void main(String[] args) {
        int[] number = {30, 49, 46, 68, 29};

       int largest = getLargest(number);
        System.out.println("The largest Number is: " + largest);

    }
    public static int getLargest(int[] numbers) {

        int largest = numbers[0];
         for (int counter = 0; counter <= numbers.length - 1; counter++){
            if (numbers[counter] > largest) {largest = numbers[counter];}
         }
        return largest;
     }

}
