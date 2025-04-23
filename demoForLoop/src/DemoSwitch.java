public class DemoSwitch {
  public static void main(String[] args) {

    // Switch
    // it can check one variable only
    // equals to (No range of variable)
    // You hvae to break the switch yourself

  
    int x = 0;
    x = 4;
    switch (x) {
      case 1:
        System.out.println("hello");
        break;
      case 2:
        System.out.println("goodbye");
        break;
      case 3:
        System.out.println("bootcamp");
        break;
      case 4:
        System.out.println("other cases");
        break;
      default:
        break;
        
    }

    int value = 3;
    x = 4;
    switch (x) {
      case 1:
        value = value * 3;
      case 2:
        value = value * 3;
      case 3:
        value = value * 3;
      case 4:
        value = value * 3;
      default:
    }
    System.out.println(value);

  }
}
