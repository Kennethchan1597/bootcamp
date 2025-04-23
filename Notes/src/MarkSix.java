import java.util.Arrays;
import java.util.Random;

public class MarkSix {
  public static void main(String[] args) {

    // 1. Generate 6 numbers in markSix (while loop)
    // 2. Use for loop to check duplicate numbers in the array (Inside the while loop)
    // 3. Duplicated -> break; back to generate numers
    // 4. !Duplicated -> continue; count + 1, generate next number;

    int[] markSixs = new int[6];
    int k = 0;
    boolean found = false;
    while (k < 6) {
      int num = new Random().nextInt(49) + 1;
      found = false;
      for (int markSix : markSixs) {
        if (num == markSix) {
          found = true;
          break;
        }
      }
      if (!found) {
        markSixs[k] = num;
        k++;
      }
    }
    System.out.println(Arrays.toString(markSixs));

  }
}
