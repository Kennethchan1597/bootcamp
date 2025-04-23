import java.util.Arrays;

public class Bubblesort {
  public static void main(String[] args) {

    // 1. Consider the j=0 for loop first
    // 2. In this loop, compare current value to next value
    // 3. Compare adjcent values
    // 4. arrs[j] > arrs[j+1] -> switch to right
    // 5. At the end, arrs[j+1] compares the last number in the array and next number out of the array
    // 6. ie. j < arrs.length - 1
    // After single j loop, start from the beginning again to compare the adjcent values (i loop)x
    // 7. for each loop, the largest value is alredy placed at the end
    // 8. ie. when i = 1; (j - 1) loop can omit the last loop since the largest value is alrdy dicided
    // 9. As so, i = 2; (j - 2) 
    // 10. i = 3; (j - 3)
    // ie. j < arrs.length - i - 1

    int[] arrs = {3, 6, 90, 8, 12, 15, 17, 99, 302, -5, -19, 1};
    int temp;
    for (int i = 0; i < arrs.length - 1; i++) {
      for (int j = 0; j < arrs.length - i - 1; j++) {
        if (arrs[j] > arrs[j+1]) {
          temp = arrs[j];
          arrs[j] = arrs[j + 1];
          arrs[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arrs));


  }
}
