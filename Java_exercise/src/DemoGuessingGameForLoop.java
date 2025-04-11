import java.util.Random;
import java.util.Scanner;

public class DemoGuessingGameForLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int input = 0;
    int min = 1;
    int max = 100;
    int bomb = random.nextInt(max) +1;
    int round =1;

    for (int i = 0; i < max && input != bomb; i++) {
      System.out.println("Please enter a number between " + min + "-" + max);
      input = scanner.nextInt();
      if (input < min || input > max) {
        continue;
      }
      if (input < bomb) {
        min = input + 1;
      } else if (input > bomb) {
        max = input - 1;
      } round++;
    }
    System.out.println("Round: " + round + "Bomb!! You lose!!!");

    scanner.close();

  }
}
