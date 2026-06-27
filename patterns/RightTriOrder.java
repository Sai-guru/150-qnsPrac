package patterns;

import java.util.Scanner;

// no=5
// 1
// 12
// 123
// 1234
// 12345

public class RightTriOrder {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row=1;row<=n;row++){

        for(int col=1;col<=row;col++) System.out.print(col+" ");
            System.out.println();

        }


     }
}
