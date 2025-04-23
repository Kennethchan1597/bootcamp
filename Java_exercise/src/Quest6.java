public class Quest6 {
  /**
   * Expected output: 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {

    // for loop to print first 15 numbers in Fibonacci Sequence
    int[] fibs = new int[15];
    fibs[0] = 0;
    fibs[1] = 1;
    for (int i = 2; i < fibs.length; i++) {
      fibs[i] = fibs[i - 2] + fibs[i - 1];
    }
    for (int fib : fibs) {
      System.out.println(fib);
    }
  }
}
