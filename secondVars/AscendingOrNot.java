//Problem to check whether all the numbers are arranged in ascending order
//  Input-1 = 4567
//  Output: Yes
//  Input-2 = 4576
// Output: No

import java.util.Scanner;
public class AscendingOrNot {

    public static void isAscend(int n){
        String str = Integer.toString(n);

        for(int i=0;i<str.length()-1;i++) {

            if(str.charAt(i) > str.charAt(i+1)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isAscend(n);

    }

}
