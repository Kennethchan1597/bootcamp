public class Week1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Primitives
        // int can be assigned to a double, but reverse is not automatic:
        // int -> double (widening, no info lost)
        // double -> int (narrowing, possible lossy conversion)
        int a = 15;
        double b = a; // widening, works, 15 -> 15.0
        System.out.println(b); // 15.0
        double x = 20;
        // int y = x; // error: possible lossy conversio
        System.out.println(x);


        // String
        String s4 = "hello";
        // String method 1.equals() -> (to check if it equals something), Primitives have no tools (Store value only)
        // 1.
        s4.equals("hello"); // check if s4 = hello
        System.out.println(s4.equals("hello")); // true
        System.out.println(s4.equals("male")); // false
        // 2.
        boolean result = s4.equals("hello");
        System.out.println(result); // true

        // String method 2.length() -> (to check parameters)
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
        String sentence = "lhabfvhlafrvj.kdsV";
        System.out.println(sentence.length());
        if (sentence.length() >= 10 ) {
            System.out.println("iAmSoHungry");
        }
        // if else example 1
        if (sentence.length() > 20 ) {
            System.out.println("longer then 20 characters");   
        } else {
            System.out.println("shorter than 20 characters");
        }
        // if else example 2
        char gender = 'F';
        if (gender == 'M') {
            System.out.println("He is a male");
        } else {
            System.out.println("She is a female");
        }
        // if else example 3
        boolean isMale = true;
        if (isMale) {
            System.out.println("He is a male");
        } else {
            System.out.println("He is not a male");
        }


    }
}
