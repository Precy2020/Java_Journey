package special_assignments;
import java.util.Scanner;
public class StudentGrades {

    private static int numberOfStudents;
    private static int numberOfSubjects;
    private static Scanner input = new Scanner(System.in);
    private static int score;
    private static String[][] test = new String[numberOfStudents][numberOfSubjects];


    public static void main(String[] args) {
        firstStage();
    }


    public static void scoreValidator() {
        score = input.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Not valid :( please try again ");
            scoreValidator();
        }
    }

    public static void firstStage() {
        System.out.println("How many students do you have?");
        numberOfStudents = input.nextInt();
        System.out.println("How many subject do they offer?");
        numberOfSubjects = input.nextInt();
        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>> \nsaved successfully!");
        String numbersOfStudent = "Entering score for student";
        String numbersOfSubject = "Enter score for subject";

        for (int index = 1; index <= numberOfStudents; index++) {
            for (int index2 = 1; index2 <= numberOfSubjects; index2++) {
                System.out.println(numbersOfStudent + " " + index + " \n" + numbersOfSubject + " " + index2);
                scoreValidator();
            }
        }


    }


    }
