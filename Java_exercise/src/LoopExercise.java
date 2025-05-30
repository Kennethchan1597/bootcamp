import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop

    String s1 = "hello";
    for (int i = 0; i < 6; i++) {
      System.out.println(s1);
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if

    int n2;
    for (int i = 1; i < 21; i++) {
      if (i % 2 == 0) {
        n2 = i;
        System.out.println(n2);
      }
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if

    int n3 = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        n3 = i;
        System.out.println(n3);
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop

    int n4 = 0;
    for (int i = 0; i < 16; i++) {
      n4 += i;
    }
    System.out.println(n4);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if

    int o = 0;
    int e = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        o += i;
      } else {
        e += i;
      }
    }
    System.out.println(o * e);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    boolean isFound = false;
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == 'd') {
        isFound = true;
      }
    }
    if (isFound) {
      System.out.println("d is found");
    } else {
      System.out.println("d is not found");
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean isTrue = false;

    for (int i = 0; i <= s8a.length() - s8b.length(); i++) {
      if (s8a.substring(i, i + s8b.length()).equals(s8b)) {
        isTrue = true;
      }
    }

    if (isTrue) {
      System.out.println("s8b is a substring.");
    } else {
      System.out.println("s8b is not a substring.");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9) {
        count++;
      }
    }
    System.out.println("count=" + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10));


    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int counter = 0;
    for (int i = 0; i < s11.length(); i++) {
      if (s11.charAt(i) - 'a' < 0) {
        counter++;
      }
    }
    System.out.println("count uppercase=" + counter);


    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****

    String pattern = "*****";
    for (int i = 0; i < 3; i++) {
      System.out.println(pattern);
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int score = 0;
    char grade = ' ';

    for (int i = 0; i < s13.length(); i++) {
      grade = s13.charAt(i);
      switch (grade) {
        case 'l':
          score++;
          break;
        case 'r':
          score += 3;
          break;
        case 'd':
          score += 2;
          break;
        case 'u':
          score += 4;
          break;
        default:
          score--;
          break;
      }
    }
    System.out.println(score);


    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long max = Integer.MIN_VALUE;
    long min = Integer.MAX_VALUE;
    for (long arr : arr14) {
      if (arr > max) {
        max = arr;
      } else if (arr < min) {
        min = arr;
      }
    }
    System.out.println(max);
    System.out.println(min);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    float[] fs = {0.2f, 0.3f, 0.6f};

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal

    for (int i = 0; i < fs.length; i++) {
      fs[i] =
          BigDecimal.valueOf(fs[i]).add(BigDecimal.valueOf(0.1)).floatValue();
    }
    System.out.println(Arrays.toString(fs));

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int counte = 0;
    for (String string : arr18) {
      if (string.equals(target)) {
        counte++;
      }
    }
    System.out.println("count name=" + counte);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    int maxIdx = 0;
    int maxx = Integer.MIN_VALUE;
    int minIdx = 0;
    int minn = Integer.MAX_VALUE;
    for (int i = 0; i < s19.length(); i++) {
      if (s19.charAt(i) > maxx) {
        maxx = s19.charAt(i);
        maxIdx = i;
      } else if (s19.charAt(i) < minn) {
        minn = s19.charAt(i);
        minIdx = i;
      }
    }

    s19 = s19.replace(s19.charAt(maxIdx), 'x')
        .replace(s19.charAt(minIdx), s19.charAt(maxIdx))
        .replace('x', s19.charAt(minIdx));

    System.out.println(s19);



    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 =
        new String[] {"python", "array", "programming", "java", "bootcamp"};
    String longest = "";
    for (String arr2 : arr20) {
      if (arr2.length() > longest.length()) {
        longest = arr2;
      }
    }
    System.out.println("longest=" + longest);

  }
}
