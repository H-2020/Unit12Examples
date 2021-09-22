package examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;

public class Example4 {

    public static void main(String[] args) {

        LocalDate birthdayOfMySon = LocalDate.of(2021,9,26);
        Year.isLeap(2021);
        LocalTime birthdayTimeOfMySon= LocalTime.of(00,30);
        System.out.println("Day of year: " + birthdayOfMySon.getDayOfYear());
        System.out.println("Day of month: " + birthdayOfMySon.getDayOfMonth());
        System.out.println("Day of week: " +birthdayOfMySon.getDayOfWeek());
        System.out.println("Time of birthday: "+birthdayTimeOfMySon);



    }
}
