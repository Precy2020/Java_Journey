package training_ground;

public class SwitchArray {

    public static void main(String[] args) {
        SwitchArray.collectInput();
    }

    public static void collectInput() {
        int[][] numbers = {{2, 4, 8, 6, 9},
                           {2, 4, 8, 6, 9},
                           {2, 4, 8, 6, 9},
                           {2, 4, 8, 6, 9},
                           {2, 4, 8, 6, 9},};

        for (int index = 0; index < numbers.length; index++){
            int add1 = numbers[0][0] + numbers[4][4];
            System.out.println(add1);

        }

    }


}