public class Week2 {

  public static void main(String[] args) {

    // Java.lang class is autoimported whatever use or not
    // Import classes need memory

    // OOP (object-oriented programming)
    // Private attribute can still be accessed in the same class using . to extract
    // for example, p1.name (while private name)
    // !!! pay attention to the above example
    // p1.name (ie. extracting the information in the attribute)
    // p1.name() (ie. call the method set previos, if there is any changes or special actions in the method, it causes different output)
    // Three main elements( 1.Attributes 2.Methods 3.Constructors )

    // Constructor
    // public Person(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }
    // Person p = new Person("Alex", 25); // You must provide both name and age

    // Special compile error
    // public boolean contain(String target) {
    // for (String name : this.names) {
    // return name.equals(target) ? true : false;
    // }
    // }
    // "Hey! What if the loop never runs? Then nothing is returned! But your method says it will return a boolean!"


    // Constructor advantages
    // 1. Ensure that all required information is provided
    // 2. Don't need to call setters separately for every field
    // Array [] (allows you to store multiple values of the same type into single variable

    // Bubble sort & Insertion sort
    // Algorithm of BigDecimal (.add(), .subtract(), .multiply(), .divide() )
    // Math (.pow(), .round(), .sqrt(), .max(), .min())
    // LocalDate class
    // More of string method, indexOf(), startsWith(), endsWith(), trim(), substring(), toLowerCase(), contains(), isEmpty()

    // Wrapper class, object versions of primitive data types
    // Primitive upcast & downcast
    // byte -> short -> int -> long -> float -> double (auto-upcast)
    // char -> int

    // For each loop (only for looping an array) (WARNING: no access to index and not modify the original array)
    // 1. (Normal For loop)
    int arrays[] = new int[26];
    for (int i = 0; i < arrays.length; i++) {
      System.out.println(arrays[i]);
    }
    // 2. (For each loop) (when you want to loop all individuals within an array once)
    for (int array : arrays) { // take array = array[i] form all values in arrays!!
      System.out.println(array); // (array) = (array[i])
    }

    // Three ways to express array
    // 1.
    int[] array = new int[3];
    array[0] = 2;
    array[1] = 5;
    array[2] = 87;
    // 2. only used when you want to create array separately
    int[] arra = new int[] {2, 5, 87};
    int[] arra2;
    arra2 = new int[] {2, 5, 87}; // this works, and you can type anything inbetween
    // 3.
    int[] arr = {2, 5, 87};
    int[] arr2;
    // arr2={2,5,87}; // compling error

    // Search for a Specific Value
    int[] scores = {50, 75, 90, 85};
    int target = 90;
    boolean found = false;
    for (int score : scores) { // (For each loop)
      if (score == target) {
        System.out.println(target + " is in the array!");
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println(target + " is not in the array.");
    }

    // Wrapper Class of byte, short, int, long, float, double
    Byte b2 = Byte.valueOf((byte) 2);
    Short s2 = Short.valueOf((short) 2);
    Integer i1 = Integer.valueOf(2);
    Long l1 = Long.valueOf(2);
    Float f1 = Float.valueOf(2.1f);
    Double d1 = Double.valueOf(2.1);

    Integer x3 = Integer.valueOf(5); // Manual convert
    int x4 = x3.intValue(); // Manual convert
    Integer x = 5; // Autoboxing (int → Integer)
    int y = x; // Unboxing (Integer → int)


  }
}
