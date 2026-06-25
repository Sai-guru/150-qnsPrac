// Arrangement of odd sequence followed by even sequence
// i/P:361589
// o/p: 315968

import java.util.Scanner;
public class OddSeqPrint {

    public static int oddEven(int n){

        //lets use string to store the odd and even numbers..
        String odd = "",even ="";
        String str = Integer.toString(n);

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);

            if(curr%2!=0) odd+=curr;
            else even+=curr;
        }

        odd += even;
        return Integer.parseInt(odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(oddEven(num));

    }
}
//if need odd even count just incr inside the if , else to get it 
// and add them before or during returning the final value.