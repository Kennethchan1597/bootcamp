import java.util.Arrays;

public class Classroom {

  private String[] names;
  private String tutor;

  public void setName(String[] names) {
    this.names = names;
  }

  public String[] getName() {
    return this.names;
  }

  public boolean contains(String target) {
    for (String name : this.names) {
      if (name.equals(target)) {
        return true;
      }
    }
    return false;
  }


  private char[] chs;

  public boolean equalss(String ss) {
    if (this.chs.length != ss.length()) {
      return false;
    }
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] != ss.charAt(i)) {
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {

    Classroom c1 = new Classroom();
    String[] c1s = {"John", "Mary", "Leo"};
    c1.setName(c1s);

    System.out.println(c1.contains("Leo"));

  }
}
