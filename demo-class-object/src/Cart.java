public class Cart {

  private Item[] items;

  public void setItemAmount(Item[] items) {
    this.items = items;
  }

  public Cart() {
    this.items = new Item[0];
  }

  public int size() {
    return this.items.length;
  }

  public double checkAmount() {
    double total = 0;
    for (Item item : items) {
      total += item.singleAmount();
    }
    return total;
  }

  public static void main(String[] args) {

    Cart c1 = new Cart();

    Item[] ci1 = new Item[]{
      new Item(10.0, 2),
      new Item(2.0, 5)
    };

    c1.setItemAmount(ci1);

    System.out.println(c1.checkAmount());

  }
}
