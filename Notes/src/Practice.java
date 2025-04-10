

public class Practice {
  public static void main(String[] args) {

    // Count the even number from 0-9
    int counter = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        counter++;
      }
    }
    //System.out.println("Total Even number: " + counter);

    // Find the larger number
    int num1 = 10;
    int num2 = 12;
    int num3 = 13;
    if (num1 > num2 && num1 > num3) {
      //System.out.println(num1);
    } else if (num2 > num1 && num2 > num3) {
      //System.out.println(num2);
    } else if (num3 > num2 && num3 > num1) {
      //System.out.println(num3);
    }

    boolean isMax = num1 > num2 && num1 > num3;
    if (isMAX) {
      //System.out.println(isMax);
    }



    // if else example 5
    int grade = 49;
    if (grade > 90) {
      //System.out.println("Exellent");
    } else if (grade > 75) {
      //System.out.println("Great");
    } else if (grade >= 50) {
      //System.out.println("Passed");
    } else if (grade != 100) {
      //System.out.println("Not full mark");
    } else if (grade < 50) {
      //System.out.println("Failed");
    }

        // Special example for string.equals
        String tdyDrink = "Coffee";
        if (tdyDrink.equals("Coffee")) {
            //System.out.println("Today is drinking cofee");
        } else {
            //System.out.println("Today is not drinking coffee");
        }
        // Double denial (when True is useless, only need to deny)
        // 1.
        if (tdyDrink.equals("Coffee") == false) {
            //System.out.println("Today is not drinking coffee");
        }
        // 2.
        if (!tdyDrink.equals("Coffee")) {
            //System.out.println("Today is not drinking coffee");
        }


    String sentence = "lhabfvhlafrvj.kdsV";
    // if else example 1
    if (sentence.length() > 20) {
      //System.out.println("longer then 20 characters");
    } else {
      //System.out.println("shorter than 20 characters");
    }
    // if else example 2
    char gender = 'F';
    if (gender == 'M') {
      //System.out.println("He is a male");
    } else {
      //System.out.println("She is a female");
    }
    // if else example 3
    boolean isMale = true;
    if (isMale) {
      //System.out.println("He is a male");
    } else {
      //System.out.println("He is not a male");
    }

    // Odd no. even no. and(&&) or(||)
    int m1 = 7;

    // 1.
    if (m1 % 2 == 1) {
        //System.out.println("This is an odd number");
    } else {
        //System.out.println("This is an even number");
    }
    // 2.
    int m2 = 17;
    boolean isOdd = m2 % 2 == 1; // True
    boolean isLargerThan10 = m2 >= 10;
    if (isOdd) {
        if (isLargerThan10) {
            System.out.println("This is an odd number and larger than 10");
        } else {
            System.out.println("This is an odd number and smaller than 10");
        }
    } else {
        if (!isLargerThan10) {
            System.out.println("This is an even number and larger than 10");
        } else {
            System.out.println("This is an even number and smaller than 10");
        }
    }

    // Example: check if the last character is a
    String s2 = "ashdgj";
    if (!(s2.length() >= 3)) {
      //System.out.println("hello");
    } else {
      //System.out.println("goodbye");
    }
    // 1.
    if (s2.charAt(5) == 'a') {
      //System.out.println("Yes");
    } else {
      //System.out.println("No");
    }
    // 2.
    if (s2.charAt(s2.length() - 1) == 'a') {
      //System.out.println("Yes");
    } else {
      //System.out.println("No");
    }

    // Searching
    String sen1 = "welcome to bootcamp.";
    // 1. Find the number of 'o'
    int counters = 0;
    for (int i = 0; i < sen1.length(); i++) {
      if (sen1.charAt(i) == 'o') {
        counters += 1;
      }
    }
    //System.out.println("number of o = " + counters);

    // given a - z, convert to 1-26
    char v = 'a';
    int ans = v - 'a' + 1;
    //System.out.println(ans);

  }
}
