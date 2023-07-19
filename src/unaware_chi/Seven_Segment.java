package unaware_chi;

public class Seven_Segment {
    public static void main(String[] args) {

        String[][] segment = {{"1", "1", "1", "1", "1"}, {"1", "0", "0", "0", "0"}, {"1", "1", "1", "1", "1"}, {"1", "0", "0", "0", "1"}, {"1", "1", "1", "1", "1"}};

        for (int index = 0; index < segment.length; index++) {
            for (int index2 = 0; index2 < segment.length; index2++) {

                if (segment[index][index2].equals("1")) segment[index][index2] = "#";
                if (segment[index][index2].equals("0")) segment[index][index2] = " ";



                System.out.print(segment[index][index2] + " ");

            }
            System.out.println();
        }


    }
}
