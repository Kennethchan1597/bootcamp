public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    // String is not a primitive
    String s1 = "Hello";
    String s2 = "100";
    // String + operation, connection
    System.out.println(s1 + s2); //Hello100
    int i = 100;
    System.out.println(s2 + i); //100100
  }
}
