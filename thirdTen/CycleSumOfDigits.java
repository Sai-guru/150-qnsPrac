package thirdTen;

// Sum of Sums of Digits in Cyclic Order 
// If your input number is (3215), the cyclic process breaks down like this:
// Sum of all digits: (3 + 2 + 1 + 5 = 11)
// Drop the first digit ((3)), sum the rest: (2 + 1 + 5 = 8)
// Drop the next digit ((2)), sum the rest: (1 + 5 = 6)
// Drop the next digit ((1)), sum the rest: (5)
// Total Cyclic Sum = (11 + 8 + 6 + 5 = 30 )

public class CycleSumOfDigits {

    public static int cycleSum(int n){

        String str = Integer.toString(n);
        int sumOfAll = 0,res = 0;

        //sum of all digits
        for(int i=0;i<str.length();i++) sumOfAll+= str.charAt(i)-'0';

        //sum of all digits except first digit
        for(int i=0;i<str.length();i++) {

            res += sumOfAll;
            sumOfAll -= str.charAt(i)-'0';

        }
        return res;
    }


    public static void main (String[] args){
        int num = 582109;
        System.out.println(cycleSum(num));
    }

}
