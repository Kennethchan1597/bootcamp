public class Demodouble              {
    public static void main(String[] args)              {
        int x = 9;

        // Store a no. w/ decimal places, type = double
        double y = 9.9;
        System.out.println(y);

        // Example let a be 99.9 and b be 3, calculate 3a
        // Problem, error ocuurs when involving decimal places calculation
        // Solution, not to write algorithm and program like this
        double a = 99.9;
        int b = 3;
        System.out.println(a * b);
        // 299.70000000000005

        // Why 10/3 = 3.0, not 3.3?
        double w = 10 / 3;
        System.out.println(w);
        // System.out.println(w/0);
        System.out.println("123");
        // Program reading from right to left in java
        // 1. int/int, 10/3=3
        // 2. set w = 3
        // 3. store w as double (decimal places)
        // 4. w = 3
    }
}













