import org.w3c.dom.css.Counter;

public class Week1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // Primitives (int, double, long, short, byte, float, boolean, char)
        // Algorithm (+, -, *, /, % ) (odd number & even number)
        // 3 string.methods, if else
        // For loop ( initialization; condition; modifier ) (searching, conditaional summation)
        // While Loop (2 nd week Condition only, similar to For Loop)
        // Do While Loop (2nd week, no entry condition)
        // Continue & Break (DemoGuessingGame)
        // ASCII = computer background code assigned for every computer character

        // int can be assigned to a double, but reverse is not automatic:
        // int -> double, char -> int (widening, no info lost)
        // double -> int (narrowing, possible lossy conversion)
        int a = 15;
        double b = a; // widening, works, 15 -> 15.0
        // System.out.println(b); // 15.0
        double x = 20;
        // int y = x; // error: possible lossy conversio
        // System.out.println(x);

        // !! Every value needs to be written(assigned first before use)
        // int input;
        // input != hair (Read, so invalid, input is not yet assign)
        // input = scanner.NextInt() (Write, so valid, assigning scanner into input)

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

        // String method 2.length() -> (to check length of character)
        // 1.
        s4.length(); // check the length of s4
        System.out.println(s4.length()); // 5
        // 2.
        int s4length = s4.length();
        System.out.println(s4length); // 5

        // String method 3.charAt() -> (to check the characters at certain position)
        // char - char -> int - int (Special)
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
        String acc = "cde";
        String name = (acc != "as") ? acc : "Please enter your name";
        System.out.println("Fuck you" + " " + name);

        // and or
        int x7 = 8;
        if (x7 < 10 || x7 % 2 == 0 && x7 >= 15) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        // For Loop (Searching)
        // 3 statements for ( initialization; condition; modifier )
        // Step 1: loop, from i = 0 until s10.length
        // Step 2: during the loop, if it meets the condition, then execute
        // Step 3: end the loop and print the result
        String s10 = "Hello World";
        int counter = 0;
        for (int i = 0; i < s10.length(); i = i + 1) {
            if (s10.charAt(i) == 'o') {
                counter = counter + 1;
            }
        }
        System.out.println("Number of O: " + counter);

        // For Loop
        int result2 = 2;
        for (int i = 0; i < 3; i++) {
            result2 *= 2;
        }
        System.out.println(result2);

        // While Loop
        int result3 = 2;
        int k = 0;
        while (k < 3) {
            result3 *= 2;
            k++;
        }
        System.out.println(result3);

        String uB = null;
        String uC = null;

        String userB = (uA != null) ? uB : "Guest B";
        String userC = (uA != null) ? uC : "Guest C";

        uB = scanner.next();
        uC = scanner.next();

    }
}
