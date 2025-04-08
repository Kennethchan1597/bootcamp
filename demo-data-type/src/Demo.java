public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int y = 100;
        System.out.println(y);

        // to re-assign a variable
        // variable can only be defined once
        y = 200;
        System.out.println(y);

        // basic algorithm
        int a = 1 + 2;
        System.out.println(a);
        y = y + 2;
        System.out.println(y);

        // example define B as 99, b-200=q, 10q = z
        int b = 99;
        int q = b - 200;
        int z = 10 * q;
        System.out.println(z);

        // divisiom
        int r = 4 / 2;
        System.out.println(r);

        // 2.5 -> truncate decimal part, 5 / 2 = 2.5
        int r2 = 5 / 2;
        System.out.println(r2);
        int r3 = 10 / 3;
        System.out.println(r3);

        // Example
        int s1 = 71;
        int s2 = 82;
        int avg = (s1 + s2) / 2;
        System.out.println(avg); // 76.5 because it reads from right to left

        int s3 = 71;
        int s4 = 82;
        double avg2 = (s3 + s4) / 2;
        System.out.println(avg2); // 76.0

        double s5 = 71;
        double s6 = 82;
        double avg3 = (s5 + s6) / 2;
        System.out.println(avg3); // 76.5



        // To convert double into intger, add (int) after =, before the calculation
        double k = 3.3;
        double result = k * 2;
        System.out.println(result);


        double k2 = 3.3;
        int result2 = (int) k * 2;
        System.out.println(result2);


        // PS, any calculation involving double results in double
        // But integer cannot convert into double in normal ways, unless adding (int)

    }
}
