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

    // String methods
    // Primitives have no tools (Store value only)

    // String method 1: .equals()
    // -> To check if it equals something
    String s4 = "hello";
    System.out.println(s4.equals("hello")); // true
    System.out.println(s4.equals("male")); // false

    boolean result = s4.equals("hello");
    System.out.println(result); // true

    // String method 2: .length()
    // -> To tell the length (int) of string
    System.out.println("hello".length()); // 5

    int result2 = s4.length();
    System.out.println(result2); // 5

    // String method 3: .charAt()
    // -> To find the char at certain index
    System.out.println("hello".charAt(2)); // l

    // String method 4: .indexOf()
    System.out.println("hello jfdooooop".indexOf('o', 5)); // first index of 'o', starts from i=5
    System.out.println("hello".indexOf('a')); // -1 if not found

    // String method 5: .isEmpty()
    System.out.println("".isEmpty()); // true
    System.out.println("  ".isEmpty()); // false

    // String method 6: .trim()
    System.out.println("hello   ".trim()); // "hello"

    // String method 7: .substring()
    System.out.println("hello".substring(1, 3));

    // Coding style: Chain methods
    System.out.println("hello   ".replace('e', 'a').trim().charAt(1)); // a

    // Check of the string value is Palindromic
    // madam
    // ada

    String target = "meusem";
    String firstHalf;
    String secondHalf;
    
    firstHalf = target.substring(0, target.length() / 2);

    if (target.length()%2 == 0) {
      secondHalf = target.substring(target.length()/2);
    } else  {
      secondHalf = target.substring(target.length()/2 + 1);
    }

    String reversed = "";
    for (int j = secondHalf.length() - 1; j >= 0 ; j--) {
      reversed += secondHalf.charAt(j);
    }

    boolean Palindromic = false;

    if (firstHalf.equals(reversed)) {
      Palindromic = true;
    }
    System.out.println(Palindromic);

  }
}
