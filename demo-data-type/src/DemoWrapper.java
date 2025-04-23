public class DemoWrapper {
  public static void main(String[] args) {
    
    // Wrapper Class of char
    Character c1 = Character.valueOf('a');
    System.out.println(c1); // a
    char c0 = c1.charValue();
    System.out.println(c0); // a (Primitive)

    System.out.println(c1.compareTo(Character.valueOf('c')));

    // Wrapper Class of boolean
    Boolean b1 = Boolean.valueOf(true);

    // Wrapper Class of byte, short, int, long, float, double
    Byte b2 = Byte.valueOf((byte)2);
    Short s2 = Short.valueOf((short)2);
    Integer i1 = Integer.valueOf(2);
    Long l1 = Long.valueOf(2);
    Float f1 = Float.valueOf(2.1f);
    Double d1 = Double.valueOf(2.1);


    // Autoboxing (Both side should be in same field)
    // Java automatically converts the primitive int 5 to an Integer object.
    Integer x = 5;

    Integer c = Integer.valueOf(200);
    Integer d = Integer.valueOf(200);
    System.out.println(c == d);

    // Unboxing
    int x2 = Integer.valueOf(3);
    

    

  }
}
