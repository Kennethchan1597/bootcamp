import java.util.Scanner;

public class Demo2 {
  public static void main(String[] args) {
    
    // 1-100, bomb = 67

    Scanner scanner = new Scanner(System.in);


    int bomb = 67;
    int input;
    int min =1;
    int max =100;
    int counter = 0;
    System.out.println("please enter a number from 1-100: ");
    do {
      input = scanner.nextInt();
      counter++;
      if (input >=min && input <= max) {
      if (input < bomb) {
        min = input + 1;
        System.out.println("Too low, enter between " + min + "-" + max);
      } else if (input > bomb) {
        max = input - 1;
        System.out.println("Too high, enter between " + min + "-" + max);
      }
    }
    } while (input != bomb);

    //System.out.println(counter - 1);

    if (counter % 2 == 1) {
      System.out.println("Bomb!! User A Wins");
    } else {
      System.out.println("Bomb!! User B Wins");
    }
      


    
  }
}
