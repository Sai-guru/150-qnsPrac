package patterns;

import java.util.Scanner;

// no=5
//      1
//     12
//    123
//   1234
//  12345
public class LeftTriOrder {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row=1;row<=n;row++){

        for(int k=1;k<=n-row;k++) System.out.print(" "); //spaces

        for(int col=1;col<=row;col++) System.out.print(col);
            System.out.println();

        }


     }

}
