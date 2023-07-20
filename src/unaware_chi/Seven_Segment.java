package unaware_chi;


public class Seven_Segment {
    public static void main(String[] args) {
        seven_segment("11111111");

    }

    public static void seven_segment(String switcher) {
        String[][] hash = {{"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}};
        for (int index = 0; index < hash.length; index++) {
            for (int index2 = 0; index2 < hash[index].length; index2++) {
                if (switcher.charAt(0) == '0') {
                        hash[0][1] = " ";
                        hash[0][2] = " ";
                    }
                if (switcher.charAt(1) == '0') {
                        hash[0][3] = " ";
                        hash[1][3] = " ";
                    }
                if (switcher.charAt(2) == '0') {
                        hash[3][3] = " ";
                        hash[4][3] = " ";
                    }
                if (switcher.charAt(3) == '0') {
                        hash[4][1] = " ";
                        hash[4][2] = " ";
                    }
                if (switcher.charAt(4) == '0') {
                        hash[3][0] = " ";
                        hash[4][0] = " ";
                    }
                if (switcher.charAt(5) == '0') {
                        hash[2][0] = " ";
                        hash[1][0] = " ";
                    }
                if (switcher.charAt(6) == '0') {
                        hash[2][1] = " ";
                        hash[2][2] = " ";
                    }
                if (switcher.charAt(7) == '0'){
                    hash[0][0] = " ";
                    hash[0][1] = " ";
                    hash[0][2] = " ";
                    hash[0][3] = " ";
                    hash[1][0] = " ";
                    hash[1][3] = " ";
                    hash[2][0] = " ";
                    hash[2][1] = " ";
                    hash[2][2] = " ";
                    hash[2][3] = " ";
                    hash[3][0] = " ";
                    hash[3][3] = " ";
                    hash[4][0] = " ";
                    hash[4][1] = " ";
                    hash[4][2] = " ";
                    hash[4][3] = " ";
                }

                    System.out.print(hash[index][index2] + " ");

                }
                System.out.println();
            }
        }

    }
