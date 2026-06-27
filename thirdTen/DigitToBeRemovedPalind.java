package thirdTen;

import java.util.HashMap;
import java.util.Map;

// Find the one digit to be removed to form palindrome:
// Example 1: 12332 -> Removing '1' forms '2332' (Palindrome)
// Example 2: 251532 -> Removing '3' forms '25152' (Palindrome)
 // Example 3: 10101 -> Already a palindrome

public class DigitToBeRemovedPalind {

    public static boolean isPalind(int n){
        String str = Integer.toString(n);
        int i=0,j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;j--;
            }
            return true;
        }

    public static int digitRemove_Palind(int num){
         String str = Integer.toString(num);

         for(int i=0;i<str.length();i++){

            String remain = str.substring(0,i) + str.substring(i+1);
            int remainNum = Integer.parseInt(remain);

            if(isPalind(remainNum)) return Character.getNumericValue(str.charAt(i));
         }

         return -1;

    }

    



    public static void main(String args[]) {

        
        System.out.println("Result 1: " + digitRemove_Palind(12332));  // Output: 1        
        System.out.println("Result 2: " + digitRemove_Palind(251532)); // Output: 3
        System.out.println("Result 3: " + digitRemove_Palind(10101));  // Output: -1

    }

}
