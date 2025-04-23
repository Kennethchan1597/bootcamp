public class Quest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';
    int num = 0;
    for (int i = 0; i < str.length(); i++ ) {
      if (str.charAt(i) == 'c') {
        num = i;
      }
    }
    boolean notFound = num == 0;
    if (!notFound) {
      System.out.println("Found");
      System.out.println("The index of the last character of" + target + " is " + num);
    } else {
      System.out.println("Not Found");
    }

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...

  }
}