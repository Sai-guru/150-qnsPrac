package patterns;

// No=5
// op = 
// 1 1 1 1 1
// 2       5
// 3       5
// 4       5
// 1 1 1 1 1
import java.util.Scanner;

public class SquareShapeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 1;row<=n; row++){

            for(int col = 1;col<=n;col++){

                if(row==1 ||row==n) System.out.print("1 ");
                else if(col==1) System.out.print(row+" "); //left side
                else if(col==n) System.out.print(n+" "); //right side
                else System.out.print("  "); //in-between spaces
            }
            System.out.println();

        }
    }

}
