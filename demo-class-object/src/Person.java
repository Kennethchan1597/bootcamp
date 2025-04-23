import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {

  private double height;
  private double weight;

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }



  public double getBMI() {
    double h2 = BigDecimal.valueOf(this.height).pow(2).doubleValue();
    BigDecimal BMI = BigDecimal.valueOf(this.weight).divide(BigDecimal.valueOf(h2), 2, RoundingMode.HALF_UP);
    return BMI.doubleValue();
  }

  public static void main(String[] args) {

    Person p1 = new Person();
    p1.setHeight(1.75);
    p1.setWeight(50.2);



    System.out.println(p1.getBMI());
  }

}
