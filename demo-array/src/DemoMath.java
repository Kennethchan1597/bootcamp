import java.util.Arrays;
import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    // abs
    // pow

    Math.pow(3, 4);
    System.out.println(Math.pow(3.1, 4));

    Math.abs(3);
    
    Math.sqrt(81);

    // public static int abs(int a) {
    // return (a < 0) ? -a : a;
    // }

    int a = -3;
    int b = (a < 0) ? -a : a;
    System.out.println(b);
    

    int[] markSixs = new int[6];
    int count = 0;
    boolean found = false;
    while (count < 6) {
      int num = new Random().nextInt(49) + 1;
      found = false;
      for (int markSix : markSixs) {
        if (num == markSix) {
          found = true;
          break;
        }
      }
      if (!found) {
        markSixs[count] = num;
        count++;
      }
    }
    System.out.println(Arrays.toString(markSixs));


  }
}
