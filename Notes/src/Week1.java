import org.w3c.dom.css.Counter;

public class Week1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // Primitives (int, double, long, short, byte, float, boolean, char)

        // int can be assigned to a double, but reverse is not automatic:
        // int -> double (widening, no info lost)
        // double -> int (narrowing, possible lossy conversion)
        int a = 15;
        double b = a; // widening, works, 15 -> 15.0
        // System.out.println(b); // 15.0
        double x = 20;
        // int y = x; // error: possible lossy conversio
        // System.out.println(x);



        // String
        String s4 = "hello";
        // String method 1.equals() -> (to check if it equals something, true of false), Primitives have no tools (Store value only)
        // 1.
        s4.equals("hello"); // check if s4 = hello
        System.out.println(s4.equals("hello")); // true
        System.out.println(s4.equals("male")); // false
        // 2.
        boolean result = s4.equals("hello");
        System.out.println(result); // true

        // Special example
        String tdyDrink = "Coffee";
        if (tdyDrink.equals("Coffee")) {
            System.out.println("Today is drinking cofee");
        } else {
            System.out.println("Today is not drinking coffee");
        }
        // Double denial (when True is useless, only need to deny)
        // 1.
        if (tdyDrink.equals("Coffee") == false) {
            System.out.println("Today is not drinking coffee");
        }
        // 2.
        if (!tdyDrink.equals("Coffee")) {
            System.out.println("Today is not drinking coffee");
        }

        // String method 2.length() -> (to check length of character)
        // 1.
        s4.length(); // check the length of s4
        System.out.println(s4.length()); // 5
        // 2.
        int s4length = s4.length();
        System.out.println(s4length); // 5

        // String method 3.charAt() -> (to check the characters at certain position)
        // 1.
        s4.charAt(0); // check the chacacter at position 0 (first postion)
        System.out.println(s4.charAt(2)); // l
        // 2.
        char s4position = s4.charAt(2);
        System.out.println(s4position); // l

        // Naming Convention in Java
        // Camel case
        // 1.Start with a lowercase word
        // 2.Every new word starts with a capital letter
        // 3.No space or underscores
        String totalScoreOfStudent = "failed";
        System.out.println(totalScoreOfStudent);

        // Contitional, if... then system.out.println...
        // if else example
        String resu = "sdivisabhvlbavbhsdajbvkj";
        System.out.println(resu.length());
        if (resu.length() > 30) {
            System.out.println("Exellent");
        } else if (resu.length() > 25) {
            System.out.println("Great");
        } else if (resu.length() >= 20) {
            System.out.println("Passed");
        } else if (resu.length() != 10) {
            System.out.println("Not full mark");
        } else if (resu.length() < 10) {
            System.out.println("Failed");
        }

        // null check
        String acc = null;
        String name = (acc != null) ? acc : "Please enter your name";
        System.out.println("Fuck you" + " " + name);


        String c = "abcde";
        if (c.charAt(c.length() / 2) == 'c') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Odd no. even no. and(&&) or(||)
        int m1 = 7;
        int m2 = 17;
        // 1.
        if (m1 % 2 == 1) {
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");
        }
        // 2.
        boolean isOdd = m2 % 2 == 1; // True
        boolean isLargerThan10 = m2 >= 10;
        if (isOdd && isLargerThan10) {
            System.out.println("This is an odd number and larger than 10");
        } else if (!isOdd && isLargerThan10) {
            System.out.println("This is an even number and larger than 10");
        } else if (isOdd && !isLargerThan10) {
            System.out.println("This is an even number and smaller than 10");
        } else if (!isOdd && !isLargerThan10) {
            System.out.println("This is an even number and smaller than 10");
        }
        // and or
        int x7 = 8;
        if (x7 < 10 || x7 % 2 == 0 && x7 >= 15) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        // For Loop
        // 3 statements for ( initialization; condition; update; )
        // Step 1: loop, from i = 0 until s10.length
        // Step 2: during the loop, if it meets the condition, then execute
        // Step 3: end the loop and print the result
        String s10 = "Hello World";
        int counter = 0;
        for (int i = 0; i < s10.length(); i = i + 1) {
            System.out.println("i= " + i);
            if (s10.charAt(i) == 'o') {
                counter = counter + 1;
            }
        }
        System.out.println("Number of O: " + counter);


    }
}
