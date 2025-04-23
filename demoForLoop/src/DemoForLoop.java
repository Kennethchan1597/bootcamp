public class DemoForLoop {
  public static void main(String[] args) {
    // array + for loop
    // find max
    int[] arrs = {100, -20, 90, 17};
    int max = Integer.MIN_VALUE;
    for (int arr : arrs) {
      max = (arr > max) ? arr : max; 
    }
    System.out.println(max);


  }
}
