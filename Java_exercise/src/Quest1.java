public class Quest1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
/**
 * Expected Output:
 * 
 * I am going to add two numbers together:
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable reminder is 1
 * The variable result is 3
 */
// Primitive types and operators

      System.out.println("I am going to add two numbers together:");
      int first = 31;
      int second = 42;

      System.out.println("The first one: " + first);
      System.out.println("The second one: " + second);

      int sum = first + second;
      System.out.println("The sum is " + sum);
  
      int subtract = first - second;
      System.out.println("The subtraction reuslt is " + Math.abs(subtract));

      byte b1 = 60;
      byte b2 = 70;
      sum = b1 + b2;
      System.out.println("The another sum reuslt is " + sum);

      Boolean varB = false;
      Boolean varC = true;
      System.out.println("The variable varB is " + varB);
      System.out.println("The variable varC is " + varC);

      float fnumber = -130.20f;
      double dnumber = -20.50;
      System.out.println("The variable fnumber is " + fnumber);
      System.out.println("The variable dnumber is " + dnumber);
  
      int a = 7;
      int b = 3;
      int remainder = a % b;
      System.out.println("The variable remainder is " + remainder);
  
      // declare a variable x and assign value to it.
      int e = 7;
      int o = 8;
      int y = 4;
      int x = 2;
      int result = e - o * x / y;
      System.out.println("The result is " + result);
    }
  }