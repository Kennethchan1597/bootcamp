import java.time.DayOfWeek;
import java.time.LocalDate;

public class Week2LocalDate {
  public static void main(String[] args) {
    LocalDate today = LocalDate.of(2024, 7, 15);
    System.out.println(today); // print out a string

    System.out.println(today.plusDays(14));

    System.out.println(today.plusMonths(2));

    System.out.println(today.plusWeeks(50));

    System.out.println(today.isAfter(LocalDate.of(2024, 5, 25)));

    System.out.println(today.isBefore(LocalDate.of(2025, 4, 10)));

    System.out.println(today.equals(LocalDate.of(2025, 4, 17)));

    System.out.println(today.isLeapYear());

    // how many days have been passed from this year
    System.out.println(today.getDayOfYear());

    System.out.println(today.getDayOfMonth());

    DayOfWeek dow = today.getDayOfWeek();
    System.out.println(dow);
    System.out.println(today.getDayOfWeek());

    System.out.println(today.getYear()); // 2024

    DayOfWeek dow2 = DayOfWeek.of(7);
    System.out.println(dow2); // Sunday
    DayOfWeek dow3 = dow2.plus(18);
    System.out.println(dow3); // Thursday

  }
}
