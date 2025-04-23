public class DemoArray {
    public static void main(String[] args) throws Exception {

        int[] arr = new int[] {1, 200, 3, 4, 5, 100, 7}; // 3 memories to store the value
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 7;
        System.out.println(arr[0]);
        // Quesetion: int array w/ size 5

        // 10 7 4 -100 6
        int[] arr2 = new int[5]; // create 5 slots
        arr2[0] = 10;
        arr2[1] = 7;
        arr2[2] = 4;
        arr2[3] = -100;
        arr2[4] = 6;

        double[] arrays = new double[4];
        arrays[0] = 3.1;
        arrays[1] = 5.4;
        arrays[2] = 88.2;
        arrays[3] = -9.4;

        //System.out.println(arrays[3]);

        //System.out.println(arrays.length);



        // int array, age , find even numbers
        // print out "Age = x"
        int[] ages = new int[] {4,5,6,7,5,18, 20, 22, 23, 56, 78, 40, 50 , 66 , 43};
        int target = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] % 2 == 0 && ages[i] >= 40) {
                target = ages[i];
                break;
            }
        }
        System.out.println(target);

        // array + for + if
        // int number, largest
        int[] numbers = new int[] {4,5,6,7,5,18, 20, 22, 23, 56, 78, 40, 50 , 66 , 43};
        target = Integer.MAX_VALUE ;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < target) {
                target = numbers [i];
            }
        }
        System.out.println(target);

        //
        char[] directions = new char[] {'l', 'l', 'r', 'l', 'r'};
        // l -> score +3
        // r -> score +2
        int score = 0;
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == 'l') {
                score += 3;
            } else if (directions[i] == 'r') {
                score -= 2;
            }
        }
        System.out.println(score);


        // Swapping
        int w1 = 3;
        int w2 = 5;
        int swap = w1; 

        // Sorting
        int[] marksixs = new int[] {20, 5, 43, 39, 47, 2};
        int temp = 0;
        for (int i = 0; i < marksixs.length - 1; i++) {
            for (int j = 0; j < marksixs.length - i - 1; j++) {
                if (marksixs[j +1] < marksixs[j]) {
                    temp = marksixs[j + 1];
                    marksixs[j + 1] = marksixs[j];
                    marksixs[j] = temp;
                }
            }
        }
        for (int i = 0; i < marksixs.length; i++) {
            System.out.println(marksixs[i]);
        }

        //Counting
        char chs[] = new char[] {'o', 't', 'a', 'p'};
        // count the number of p
        int counter = 0;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == 'p') {
                counter++;
            }
        }
        System.out.println("The number of p is: " + counter);

        // Frequency Counter
        // How many characters are more than 1, // 2 (o and p)
        
        // Converts a string into an array of characters.
        String word = "opapo";
        char[] ch = word.toCharArray(); // {'o', 'p', 'a', 'p', 'o'};
        // Same as the following :
        // char[] ch = new char[] {'o', 'p', 'a', 'p', 'o'};

        int[] counter2 = new int[26];
        for (int i = 0; i < chs2.length; i++) {
            counter2[chs2[i]-'a']++;
        }
        int resul = 0;
        for (int i = 0; i < counter2.length; i++) {
            if (counter2[i] > 1) {
                resul++;
            }
        }
        System.out.println(resul);

        String username = "Jackson";
        for (char ch : username.toCharArray()) {
            
        }

    }
}
