package deltel_deltel.chapter_2.chapter_5;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;

        for(int counter = 1; counter <= 5; counter++) {
            System.out.println("Enter the student name: ");
            String student_name = scanner.next();
            System.out.println("Enter the student grade: ");
            String student_score = scanner.next();
            System.out.println(student_score);


            switch (student_score) {
                case "A":
                    counterA++;
                    break;
                case "B":
                    counterB++;
                    break;
                case "C":
                    counterC++;
                    break;
                case "D":
                    counterD++;
                    break;
                default:
                    System.out.println("You failed ");
            }
        }
            System.out.println("Total numbers of A " + counterA);
            System.out.println("Total numbers of B " + counterB);
            System.out.println("Total numbers of C " + counterC);
            System.out.println("Total numbers of D " + counterD);

    }



}
