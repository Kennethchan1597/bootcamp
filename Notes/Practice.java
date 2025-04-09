package Notes;

public class Practice {
  public static void main(String[] args) {

    // Count the even number from 0-9
    int counter = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        counter++;
      }
    }
    System.out.println("Total Even number: " + counter);

    // Find the larger number
    int num1 = 10;
    int num2 = 12;
    if (num1 > num2) {
      System.out.println(num1);
    } else {
      System.out.println(num2);
    }

    // if else example 5
    int grade = 49;
    if (grade > 90) {
      System.out.println("Exellent");
    } else if (grade > 75) {
      System.out.println("Great");
    } else if (grade >= 50) {
      System.out.println("Passed");
    } else if (grade != 100) {
      System.out.println("Not full mark");
    } else if (grade < 50) {
      System.out.println("Failed");
    }

    String sentence = "lhabfvhlafrvj.kdsV";
    // if else example 1
    if (sentence.length() > 20) {
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

    // Example: check if the last character is a
    String s2 = "ashdgj";
    if (!(s2.length() >= 3)) {
      System.out.println("hello");
    } else {
      System.out.println("goodbye");
    }
    // 1.
    if (s2.charAt(5) == 'a') {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    // 2.
    if (s2.charAt(s2.length() - 1) == 'a') {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
