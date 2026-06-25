//  Problem to count the total number of odd and even
//  numbers in the given any digit number

import java.util.Scanner;
public class countOddEvenDisp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oddCount = 0;
        int evenCount = 0;

        // while (num != 0) {
        //     int curr = num % 10;
        //    if (curr % 2 == 0) evenCount++;
        //     else oddCount++;
    // }

        //using string...
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            int curr = Character.getNumericValue(str.charAt(i));
            if (curr % 2 == 0) evenCount++;
            else oddCount++;
            
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }

}
