package firstTen;
import java.util.Scanner;

import javax.lang.model.type.NullType;

public class NthFibonacci {

    //with Recursion
    // public static int fibonacci(int n) {
    //     if (n<= 1) return n;
    //     return fibonacci(n-1) + fibonacci(n-2);
    // }

    //without Recursion
    // public static int fibonacci(int n) {
    //     int a=0,b=1,temp=0;
    //     if(n==0) return a;

    //     for(int i=2;i<=n;i++) {
    //         temp = a+b;
    //         a=b;
    //         b=temp;
    //     }
    //     return b;
    // }

    //to print the nth fibonacci number
      public static void fibonacci(int n) {
        int a=0,b=1,temp=0;
        if(n==0) {
            System.out.println(a);
            return;
        }

        if(n>=1) System.out.println(a + " ");
        if(n>=2) System.out.println(b + " ");

        for(int i=2;i<=n;i++) {
            temp = a+b;
            a=b;
            b=temp;
            System.out.println(b + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }

}
