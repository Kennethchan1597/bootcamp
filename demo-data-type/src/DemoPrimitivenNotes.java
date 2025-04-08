public class DemoPrimitivenNotes {
  public static void main(String[] args) {
    // Maximum int value +1 -> minimum int value (overflow)

    // Cannot convery larger type to smaller type, eg. integer to byte and double to float
    byte b1 = 5;
    int i2 = 10;


    // int to long
    int x = 999999999; // illegal int value, more than 32 bit
    System.out.println(x);
    long x2 = 9999999999L; // add L
    System.out.println(x2);
    byte b = 127;

    // long to int


    // Problem
    int i1 = 10;
    i1 = i1 + 1;
    System.out.println(i1);

    byte b3 = 10;
    b3 = b3 - 1; // java takes 1 as int ??
    System.out.println(b3);

    //
    b1 = 8+i2; // Cannot convert int to byte
    System.out.println(i2 + b1); // system.out always take result as int ??

    // int max = 2_147_483_648
    int i = 2147483647;
    long i2 = 2147483647;
    long i3 = 2147483648; // java default take all number as int ??
    long i4 = 2147483648L;


  }
}
