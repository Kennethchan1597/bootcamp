import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal("0.1"); // approach 
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // approach 2 (prefer)
    System.out.println(bd1);
    System.out.println(bd2);

    // bd1 + bd2 -> 0.3
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3);

    BigDecimal bd4 = bd1.subtract(bd2).abs();
    System.out.println(bd4);

    System.out.println(BigDecimal.valueOf(5).pow(3));
    

  }
}
