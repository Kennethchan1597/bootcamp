import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int input = scanner.nextInt();

    //System.out.println("input + " + input);

    // Determine if the input is odd or even number
    boolean isOdd = input % 2 == 1;
    if (isOdd) {
      System.out.println("This is an odd number");
    }

  }
}
