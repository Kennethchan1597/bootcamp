public class PalindromicCheck {
 public static void main(String[] args) {

  String target = "meusem";
    String firstHalf;
    String secondHalf;
    firstHalf = target.substring(0, target.length() / 2);
    if (target.length()%2 == 0) {
      secondHalf = target.substring(target.length()/2);
    } else  {
      secondHalf = target.substring(target.length()/2 + 1);
    }

    String reversed = "";
    for (int j = secondHalf.length() - 1; j >= 0 ; j--) {
      reversed += secondHalf.charAt(j);
    }

    boolean Palindromic = false;

    if (firstHalf.equals(reversed)) {
      Palindromic = true;
    }
    System.out.println(Palindromic);

 } 
}
