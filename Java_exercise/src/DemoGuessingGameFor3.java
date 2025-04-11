import java.util.Random;
import java.util.Scanner;

public class DemoGuessingGameFor3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Welcome To Our Boring Guessing Game!!!");
    // String userA = (uA != null) ? uA : "Guest A";

    System.out.println("Guest A please enter your name: ");
    String uA = scanner.nextLine();
    if (uA.isEmpty()) {
      uA = "Guest A";
    }
    System.out.println("Guest B please enter your name: ");
    String uB = scanner.nextLine();
    if (uB.isEmpty()) {
      uB = "Guest B";
    }
    System.out.println("Guest C please enter your name: ");
    String uC = scanner.nextLine();
    if (uC.isEmpty()) {
      uC = "Guest C";
    }
    System.out.println("Hello, Let's start our game!");

    // int bomb = random.nextInt(100 + 1);
    int max = 50;
    int min = 1;
    int bomb = random.nextInt(max) +1;
    int input;
    int round = 0;
    String player = uA;

    do {
      System.out.println(player + " please enter a number between" + min + "-" + max);
      input = scanner.nextInt();
      if (input < min || input > max) {
        continue;
      } else if (round % 3 == 2) {
        player = uA;
      } else if (round % 3 == 0) {
        player = uB;
      } else if (round % 3 == 1) {
        player = uC;
      } if (input < bomb) {
        min = input + 1;
      } else if (input > bomb) {
        max = input - 1;
      }
      round++;
    } while (input != bomb);
    
    if (round % 3 == 1) {
      player = uA;
    } else if (round % 3 == 2) {
      player = uB;
    } else {
      player = uC;
    }
    System.out.println("🎉round " + round +  " " + player + " loses the game!!!");

    scanner.close();
  }
}
