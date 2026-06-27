package patterns;

import java.util.Scanner;

// Print braces pattern program
// int n=2
// Output:
// { }
// { } {{ }}

public class BracesPattern {

    public static void BracesPtn(int n){

        for(int i=1;i<=2*n;i++){

            int parCount = (i+1)/2;

            for(int j=0;j<parCount;j++) System.out.print("{");
            
            System.out.print(" ");

            for(int j=0;j<parCount;j++) System.out.print("}");
        
            //next line
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BracesPtn(n);



    }

}

