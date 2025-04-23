import java.math.BigDecimal;

public class BankAccount {
  private String accountHolder;
  private double balance;
  private String balanceHist = "";

  public void setName(String name) {
    this.accountHolder = name;
  }

  public String getName() {
    return "Account Holder: " + this.accountHolder;
  }

  public void deposit(double deposit) {
    this.balance += (BigDecimal.valueOf(deposit).doubleValue());
    this.balanceHist = this.balanceHist + "\n" + String.valueOf(deposit);
  }

  public void withdraw(double withdraw) {
    this.balance += (BigDecimal.valueOf(withdraw).doubleValue());
    this.balanceHist = this.balanceHist + "\n" + String.valueOf(withdraw);
  }

  public String balance() {
    if (this.balance < 0) {
      return "Insufficient funds.";
    }
    return "Balance: " + String.valueOf(balance);
    // return "Balance: " + balance;
  }

  public String balanceHist() {
    return this.balanceHist;
  }



  public static void main(String[] args) {

    BankAccount p1 = new BankAccount();
    p1.setName("Alex");
    p1.deposit(200);
    p1.deposit(4000);
    p1.withdraw(-9000);
    System.out.println(p1.balance());

  }
}
