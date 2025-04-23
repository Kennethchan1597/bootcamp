public class StringMethod {
  public static void main(String[] args) {
    
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
    // -> To find the index at the first char
    System.out.println("hello jfdooooop".indexOf('o', 5)); // first index of 'o', starts from i=5
    System.out.println("hello".indexOf("ello")); // -1 if not found

    // String method 5: .isEmpty()
    // -> To check if the string is empty or not
    System.out.println("".isEmpty()); // true
    System.out.println("  ".isEmpty()); // false

    // String method 6: .trim()
    // -> To trim the useless space from start and the end
    System.out.println(" hello   ".trim()); // "hello"

    // String method 7: .substring()
    // -> to extract certain part of the string
    System.out.println("hello".substring(1, 3));

    // String method 8: .toLowerCase(); .toUpperCase()
    System.out.println("HElLo".toLowerCase()); // "hello"
    System.out.println("HElLo".toUpperCase()); //"HELLO"

    // String method 9: .contais()
    // -> To check if the string contain certain character or not
    System.out.println("HElLo".contains("hel")); // false (case-sensitive)
    System.out.println("HElLo".contains("Lo")); // true (case-sensitive)

    // String method 10: .startsWith(); .endsWith()
    // -> To check if the string starts with or end with certain char
    System.out.println("hello".startsWith("ha")); // false
    System.out.println("hello".endsWith("lo")); // true

    // Coding style: Chain methods
    System.out.println("hello   ".replace('e', 'a').trim().charAt(1)); // a

  }
}
