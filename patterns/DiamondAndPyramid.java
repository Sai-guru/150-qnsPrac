package patterns;

import java.util.Scanner;
public class DiamondAndPyramid {

    //diamond pattern
    // n=5

     public static void diamond(int n){

        System.out.println("Diamond pattern");

         // upper half
        for(int lrow =1;lrow<=n;lrow++){

            for(int lk = n;lk>lrow;lk--) System.out.print(" ");

            for(int lstar=lrow;lstar>=1;lstar--) System.out.print("* ");

            System.out.println();
        }
         // lower half
        for(int urow = 1;urow<=n;urow++){

            for(int uk = 1;uk<urow;uk++) System.out.print(" ");

            for(int ustar=n;ustar>=urow;ustar--) System.out.print("* ");

            System.out.println();
        }

    }

    //pyramid pattern
    // n=5
    public static void pyramid(int n){

        System.out.println("Pyramid pattern");
         for(int lrow =1;lrow<=n;lrow++){

            for(int lk = n;lk>lrow;lk--) System.out.print(" ");

            for(int lstar=lrow;lstar>=1;lstar--) System.out.print("* ");

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        diamond(n);
        pyramid(n);
    }

}
