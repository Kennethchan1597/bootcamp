public class Quest3 {
  public static void main(String[] args) {
    int a = 10;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if (a < 9) {
      System.out.println("a is between 0 and 8");
      // how about a > 9?
    } else if (a > 9) {
      System.err.println("a > 9");
    } else if (a < 0) {
      System.out.println("a < 0");
    }

    String str = "I love Java. I love coding";
    if (str.length() == 2) {
      System.out.println("str length = 27");
    } else if (str.length() < 27) {
      System.out.println("str length < 27");
    } else if (str.length() > 27) {
      System.out.println("str length > 27");
    }
  }
}
