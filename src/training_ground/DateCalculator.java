package training_ground;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a date (yyyy-mm-dd): ");
            String inputDate = scanner.nextLine();

            LocalDate specificDate = LocalDate.parse(inputDate);

            LocalDate date = specificDate.plusDays(28 - 7);


            System.out.println(date);

            scanner.close();
        }
    }


