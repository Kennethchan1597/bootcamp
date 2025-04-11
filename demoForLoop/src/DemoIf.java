public class DemoIf {
  public static void main(String[] args) {
    
    boolean isFemale = true;
    boolean isSmoker = true;
    int age = 45;

    // Female 40, premium 8% more
    // Male 16 or above, premium 3% more
    // Male smoker, 7% more
    // Age 70 or above, 20% more


    int premium = 120;
    if (!isFemale && isSmoker && age >= 70) {
      premium *= 1.07;
      premium *= 1.2;
    } else if (!isFemale && isSmoker) {
      premium *= 1.07;
    } else if (isFemale && age >= 70) {
      premium *= 1.2;
    } else if 
    System.out.println(premium);
    


  }
}
