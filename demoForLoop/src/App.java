public class App {
    public static void main(String[] args) throws Exception {
        int x = 2;
        x *= 2;
        x *= 2;
        x *= 2;
        //System.out.println(x);

        int value = 2;
        for (int i = 0; i < 3; i++) {
            value *= 2;
        }
        //System.out.println(value);

        // Fine the largest odd number, < 90, 0-100
        int max = 7;
        boolean isOdd = max % 2 != 0;
        // boolean smallerThen90 = true;
        for (int i = 0; i < 101; i++) {
            if (i < 90 && isOdd && i > max) {
                max = i;
            }
        }
        //System.out.println(max);


        // 0-20, sum up all even numbers
        int result = 0;
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        //System.out.println(result);

        int x1 = 90;
        int x2 = 100;
       // int result2 = (x1 > x2) ? x1 : "sd";

        // 0-30, if < 20, sum up odd numbers, if >=20, sum up even numbers
        int result3 = 0;
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 1 && i < 20) {
                result3 += i;
            } else if (i % 2 == 0 && i >= 20) {
                result3 += i;
            }
        }
        //System.out.println(result3);


        // Searching
         String sen1 = "welcome to bootcamp.";
        // 1. Find the number of 'o'
        int counters = 0;
        for (int i = 0; i < sen1.length(); i++) {
             if (sen1.charAt(i) == 'o') {
                counters +=1;
             }
            
        }
        //System.out.println("number of o = " + counters);

        // Question: sum up 5-15 -> result
        // The product of 16 -20 -> result 2
        // Single for loop

        int sum = 0;
        int product = 1;
        for (int i = 5; i < 21; i++) {
            if (i<= 15) {
                sum += i;
            } else {
                product *= i;
            }
        }
        System.out.println(sum);
        System.out.println(product);

    }
}
