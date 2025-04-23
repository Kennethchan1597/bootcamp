public class Item {
  private int quantity;
  private double price;

  public Item (double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public double getPrice(){
    return this.price;
  }

  public double singleAmount() {
    return this.getPrice() * this.getQuantity();
  }
  
}
