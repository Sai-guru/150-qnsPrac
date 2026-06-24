package firstTen;
import java.util.Scanner;

//odd or even

public class One {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2!=0) System.out.println("odd");
        else System.out.println("even");
    }
    
}
