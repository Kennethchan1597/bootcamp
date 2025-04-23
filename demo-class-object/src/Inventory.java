public class Inventory {
  private Product[] products;

  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public void add(String name, double price, int quantity) {
    Product[] newProducts = new Product[this.products.length + 1];
    for (int i = 0; i < this.products.length; i++) {
      newProducts[i] = this.products[i];
    }
    newProducts[newProducts.length - 1] = new Product(name, quantity, price);
    this.products = newProducts;
  }

  public double totalInventory() {
    double total = 0;
    for (Product product : products) {
      total += product.getPrice() * product.getQuantity();
    }
    return total;
  }

  public String toString() {
    String result = "Product List: \n";
    for (Product product : products) {
      result += product.toString() + "\n";
    }
    return result;
  }

  public static void main(String[] args) {
    Inventory i1 = new Inventory();
    Product[] p1s = new Product[] {new Product("Apple", 3, 1.5),
        new Product("Banana", 5, 0.8), new Product("Orange", 2, 1.2)};
    i1.setProducts(p1s);
    i1.add("Star", 4.2, 3);

    System.out.println(i1);

  }

}
