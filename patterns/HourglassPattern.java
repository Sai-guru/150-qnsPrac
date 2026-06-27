package patterns;

// Hour glass pattern
// n=8

//  * * * * * * * *
//   * * * * * * *
//    * * * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//    * * * * * *
//   * * * * * * * 
//  * * * * * * * *

import java.util.Scanner;

public class HourglassPattern {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int urow = 1;urow<=n;urow++){

            for(int uk = 1;uk<urow;uk++) System.out.print(" ");

            for(int ustar=n;ustar>=urow;ustar--) System.out.print("* ");

            System.out.println();
        }

        // lower half
        for(int lrow =1;lrow<=n;lrow++){

            for(int lk = n;lk>lrow;lk--) System.out.print(" ");

            for(int lstar=lrow;lstar>=1;lstar--) System.out.print("* ");


            System.out.println();
        }

    }

}
