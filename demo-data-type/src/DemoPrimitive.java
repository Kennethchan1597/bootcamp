public class DemoPrimitive {
  public static void main(String[] args) {
    // ! Primitives (int, double, long, short, byte, float, boolean, chart)

    // Primitives for Integer (int, byte, short, long)

    // Alogorithm ( +, -, *, /, % )
    // +1 to itself
    int xx = 3;
    xx = xx + 1;
    xx += 1;
    xx++;
    ++xx;

    // -1 to itself
    int yy = 3;
    yy = yy - 1;
    yy -= 1;
    yy--;
    --yy

    // byte ranges from -128 = 127
    byte a = 127;
    short b = 32766;
    int c = 21;
    long d = 99_999_999;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    // double, float
    double d1 = 9.5;
    double d2 = 9.5d;
    float f1 = 9.5f;
    // float f2 = 9.5;
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(f1);

    // boolean
    boolean b10 = true;
    b10 = false;
    int age = 66;
    boolean isElderly = age > 65;
    System.out.println(isElderly);
    System.out.println(b10);

    // char
    // Store single character
    // 'a' -> char value
    // c1 -> char variable
    char c1 = 'a';
    // char c2 = 'a3', more than one character


  }
}
