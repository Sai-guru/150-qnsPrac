// Program to reverse the number using a loop
// Ex: 143
// Output: 341 , 
import java.util.Scanner;

public class ReverseNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = (rev*10) + digit;
            num /= 10;
        }

        //if using string 
        // String str = Integer.toString(rev);
        // for(int i = str.length() - 1; i >= 0; i--) {
        //     System.out.print(str.charAt(i));
        // }

        // System.out.println();

        System.out.println(rev);
    }

}
