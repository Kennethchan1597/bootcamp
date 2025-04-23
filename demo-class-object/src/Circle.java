import java.math.BigDecimal;

public class Circle {

  private double radius;
  private String name;

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public Circle (String name, double radius) {
    this.name = name;
    this.radius = radius;
  }

  public double area() {
    return BigDecimal.valueOf(this.radius).pow(2)
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public String compare() {
    return (this.area() >= 5.0) ? "Big" : "Small";
}

public boolean isBiger(Circle circle) {
  return (this.area() > circle.area());
}

public String info() {
  return this.name + "," + this.radius;
}

  public static void main(String[] args) {

    Circle c1 = new Circle("John", 3);
    Circle c2 = new Circle("Leo", 4);

    System.out.println(c1.area());
    System.out.println(c1.compare());
    System.out.println(c1.isBiger(c2));
    System.out.println(c1.info());

  }
}
