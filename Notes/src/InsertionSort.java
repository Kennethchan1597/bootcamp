import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    
    // 1. Save the current array number as a 'key' first
    // 2. By while loop, comparing all values to the 'key'
    // 3. Whenever the value > 'key', current value moves to the right
    // 4. Until current value !< 'key'
    // 5. Insert key to the position before

    int[] arr = {3, 6, 90, 8, 12, 15, 17, 99, 302, -5, -19, 1};
    int key;
    int idx;
    for (int i = 1; i < arr.length; i++) {
      key = arr[i];
      idx = i - 1;
      while (i >= 0 && arr[idx] > key) {
        arr[idx+1] = arr[idx];
        idx--;
      }
      arr[++idx] = key;
    }
    System.out.println(Arrays.toString(arr));

  }
}
