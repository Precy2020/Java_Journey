package special_assignments;

import unaware_chi.Precious;

import java.util.Scanner;
public class StudentGrades {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    firstStage();

    }




      public static void firstStage () {
        int [][] store = new int[0][0];
          System.out.println("How many students do you have?");
          int numberOfStudents = input.nextInt();
          System.out.println("How many subject do they offer?");
          int numberOfSubjects = input.nextInt();
          System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>> \nsaved successfully!");
          String numbersOfStudent = "Entering score for student";
          String numbersOfSubject = "Enter score for subject";

          for (int index = 1; index <= numberOfStudents; index++) {
              for (int index2 = 1; index2 <= numberOfSubjects; index2++) {

                  System.out.println(numbersOfStudent+" "+index +" \n"+numbersOfSubject+" "+index2);
                  int score = input.nextInt();
                  if (score >= 0 && score <= 100){System.out.println(numbersOfStudent+" "+index +" \n"+numbersOfSubject+" "+index2);
                      System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n saved successfully!!!");


                  }
                  else{

                      for (int count = 0; count < 1;) {
                          System.out.println("Not valid!!! please try again");
                          System.out.println(numbersOfStudent+" "+index +" \n"+numbersOfSubject+" "+index2);
                          score = input.nextInt();
                          if (score >= 0 && score <= 100){
                              System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n saved successfully!!!");
                                    count++;
                          }
                      }
                  }
              }
          }
      }







}
