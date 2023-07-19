package special_assignments;

public class Total_of_a_list {
    public static void main(String[] args) {
        int[] number = {30, 49, 46, 68, 29};
        System.out.println(total(number));
    }

    public static int  total (int [] number){
        int total = 0;
        for (int count = 0; count <= number.length-1; count++){
            total = total + number[count];
        }
        return total;
    }
}
