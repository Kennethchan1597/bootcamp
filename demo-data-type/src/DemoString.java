public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    // String is not a primitive
    String s1 = "Hello";
    String s2 = "100";
    // String + operation, connection
    System.out.println(s1 + s2); // Hello100
    int i = 100;
    System.out.println(s2 + i); // 100100

    // equals() -> tools (to check if it equals something)
    // Primitives have no tools (Store value only)
    String s4 = "hello";
    s4.equals("hello"); // check if s4 = hello
    System.out.println(s4.equals("hello"));
    System.out.println(s4.equals("male"));

    boolean result = s4.equals("hello");
    System.out.println(result);

    // String method 2: length()
    System.out.println(s4.length());

    int result2 = s4.length();
    System.out.println(result2);

    // String method 3: charAt()
    // 1 is an index, whcih always start from 0
    System.out.println(s4.charAt(0));

  }
}
