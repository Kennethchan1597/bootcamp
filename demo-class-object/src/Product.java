public class Product {
  private String name;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  private double price;
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  private int quantity;
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Product (String name, int quantity, double price){
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public String toString() {
    return " - " + name + " : " + quantity + " items at " + price + "each";
  }
}
