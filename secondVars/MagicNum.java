import java.util.Scanner;

// A number is said to be a magic number, if the sum of its digits are calculated till a
// single digit recursively by adding the sum of the digits after every addition. If the
// single digit comes out to be 1,then the number is a magic number.
// for exampleNumber= 50113
// => 5+0+1+1+3=10
// => 1+0=1
// This is a Magic Number


public class MagicNum {

    public static boolean isMagicNumber(int n){

        int sum = 0;

        if(n<10) return n==1; //our base case

        // String str = Integer.toString(n);
        // for(int i=0;i<str.length();i++){
        //     int curr = Character.getNumericValue(str.charAt(i));
        //     sum+=curr;
        // }
        
        while(n>0) {
            sum+=n%10;
            n/=10;
        }

        return isMagicNumber(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isMagicNumber(num));

    }

}
