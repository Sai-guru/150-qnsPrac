package firstTen;

import java.util.Scanner;

public class Prime{

    public static boolean isPrime(int num){

        if(num==2) return true;
        if(num<=1 || num%2==0) return false;
        

        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0) return false;
        }
        return true;
    }

    // Find the Nth Prime Number
    // Input N=5 -> Output: "2 3 5 7 11" (Returns 11)
    public static int NthPrime(int n){
        int c =0;
        int startNum = 2;

        while(c < n){
            if(isPrime(startNum)) {
                c++;
                // System.out.println(startNum + " ");
            }
            startNum++;
        }
        return startNum-1;

    }


    // Count Primes in a Specific Range
    // Goal: Input 10, 20 -> Output: 4 (Primes are 11, 13, 17, 19)
    public static int countPrimeRange(int start,int end){

        int c = 0;
        for(int i=start;i<=end;i++) if(isPrime(i)) c++;
        
        return c;
    }

     // Display All Prime Numbers Till N
    public static void dispPrimeTillN(int n){

        for(int i=2;i<=n;i++){
            if(isPrime(i)) System.out.print(i+" ");
        }

    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //no need to create an obj bcos used static keyword in isPrime method

        //prime or not..- create isPrime method
        // int num = sc.nextInt();
        // if(isPrime(num)) System.out.println(num+" is prime");
        // else System.out.println(num+" is not a prime");

        //Nth prime number
        // int n = sc.nextInt();
        // System.out.println(NthPrime(n));

        //Count primes in a specific range
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        // System.out.println(countPrimeRange(start,end));

        int n = sc.nextInt();
        dispPrimeTillN(n);
    

    }
}