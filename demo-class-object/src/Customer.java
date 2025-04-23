public class Customer {

  // Attributes
  // Private, this object is not readable by default (Encapsulation)
  private String name;
  private String email;

  // Setter
  public void setName(String name) {
    if (name != null && !name.isEmpty()) {
      this.name = name;
    }
  }

  // Getter
  public String getName() {
    return this.name;
  }

  public void setEmail(String email) {
    if (email != null && email.contains("@")) {
      this.email = email;
    }
  }

  // Getter

  public String getEmail() {
    return this.email;
  }


  // This main method is not a must for a class file
  public static void main(String[] args) {
    // create object
    Customer john = new Customer();
    john.setName("John Chan");
    john.setEmail("john@gmail.com");

    Customer mary = new Customer();
    mary.setName("Mary");
    mary.setEmail("mary@gamil.com");

   System.out.println(john.getEmail());
   System.out.println(mary.getName());

  }
}
