import java.util.Scanner;

public class DemoGuessingGame {
  public static void main(String[] args) {
    
    // 1-100, bomb = 67

    Scanner scanner = new Scanner(System.in);


    int bomb = 67;
    int input;
    int min =1;
    int max =100;
    System.out.println("please enter a number from 1-100: ");
    while (input != bomb) {
      input = scanner.nextInt();
      if (input < bomb) {
        min = input+1;
        System.out.println("Please enter a number between " + min + "-" + max);
      } else if (input > bomb) {
        max = input-1;
        System.out.println("Please enter a number between " + min + "-" + max);
      } else {
        System.out.println("You Lose!!");
      }
      }

      


    
  }
}
