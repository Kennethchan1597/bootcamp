public class DemoWhileLoop {
  public static void main(String[] args) {
    int x = 2;
    x *= 2;
    x *= 2;
    x *= 2;
    System.out.println(x); //16

    // While Loop
    int result = 2;
     int p = 0;
    while (p<3) {
      result *= 2;
      p++;
    }
    System.out.println(result);

    // Do while loop

    // Continue (continue loop, so skip the result beside loop)
    for (int i = 0; i <3 ; i++ ) {
      if ( i % 2 == 1) {
        continue;
      }
      System.out.println(i);
    }

    // Break (exit for loop imediately)




  }
}
