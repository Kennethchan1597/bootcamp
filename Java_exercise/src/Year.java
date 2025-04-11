import java.util.Scanner;

public class Year {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter year eg. 1999");
    int year = scanner.nextInt();

    System.out.println("Please enter month eg. 1");
    int month = scanner.nextInt();

    boolean syear = year % 4 == 0 && year % 100 != 0;
    int dateGroup = 0;
    boolean singleMonth = month == 1 || month == 3 || month == 5 || month == 7
        || month == 8 || month == 10 || month == 12;

    if (singleMonth) {
      dateGroup = 4;
    } else if (!singleMonth && month != 2) {
      dateGroup = 3;
    }
    if (month == 2) {
      if (!syear) {
        dateGroup = 2;
      }
      if (syear) {
        dateGroup = 1;
      }
    }

    System.out.println(dateGroup);

    switch (dateGroup) {
      case 1:
        System.out.println("Total 28 days");
        break;
      case 2:
        System.out.println("Total 29 days");
        break;
      case 3:
        System.out.println("Total 30 days");
        break;
      case 4:
        System.out.println("Total 31 days");
        break;
      default:
        System.out.println("Unknown input");
    }

    scanner.close();

  }
}
