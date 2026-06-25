//  2 digit reduced subtracted form
// Ex. 6928
// 6-9= 3
// 9-2=7
// 2- 8=6
// O/p: 376
// Not 2 digit num
// Again perform RS
// 3-7=4
// 7-6=1
// O/P:41 

import java.util.Scanner;


public class digitReducedSubt {

    public static int reducedSubtraction(int n){

        if(n<100) return n;  //base case..

        String str = Integer.toString(n);
        int mainNum =0;


        for(int i=0;i<str.length()-1;i++){

            int dig1 = Character.getNumericValue(str.charAt(i));
            int dig2 = Character.getNumericValue(str.charAt(i+1));

            int diff = Math.abs(dig1-dig2);
            mainNum = (mainNum*10)+ diff; //each time 10units increases...

        }
        return reducedSubtraction(mainNum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(reducedSubtraction(num));
    }

}
