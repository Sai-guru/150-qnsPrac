package patterns;

import java.util.Scanner;

public class InvertedPatternsCollection {

    // --- QUESTION 45: Inverted Left-Aligned Triangle ---
    // no=5
    // 12345
    // 1234
    // 123
    // 12
    // 1
    public static void patternQuestion45(int n) {
        System.out.println("--- Pattern 45 Output ---");
  
        for (int row = n; row >= 1; row--) {
            // Col counts forward up to the current row limit
            for (int col = 1; col <= row; col++) System.out.print(col);
            
            System.out.println(); // Next line
        }
    }

    // --- QUESTION 46: Inverted Right-Aligned Shift (With Spaces) ---
    // no=5
    // 12345
    //  2345
    //   345
    //    45
    //     5
    public static void patternQuestion46(int n) {
        System.out.println("\n--- Pattern 46 Output ---");
  
        for (int row = 1; row <= n; row++) {
            
            for (int space = 1; space < row; space++) System.out.print(" ");
            
            for (int col = row; col <= n; col++) System.out.print(col);
            
            System.out.println(); // Next line
        }
    }

    // --- QUESTION 47: Inverted Left-Aligned Decreasing Row (Duplicate Target/Alternative Layout) ---
    // no=5
    // 12345
    // 2345
    // 345
    // 45
    // 5
    public static void patternQuestion47(int n) {
        System.out.println("\n--- Pattern 47 Output ---");

        for (int row = 1; row <= n; row++) {
            
            for (int col = row; col <= n; col++) System.out.print(col);
            
            System.out.println(); // Next line
        }
    }

    // --- QUESTION 48: Inverted Left-Aligned Decreasing Row (Decreasing Numbers) ---
    // no=5
    // 54321
    // 4321
    // 321
    // 21
    // 1

    public static void patternQuestion48(int n){
        System.out.println("\n--- Pattern 48 Output ---");

        for(int row=1;row<=n;row++) {

            for(int col=n-row+1;col>=1;col--) System.out.print(col);

            System.out.println(); // Next line

        }
    }

    // --- QUESTION 49: Inverted Left-Aligned Decreasing Row (Decreasing Numbers) ---
    // no=5
    // 1
    // 10
    // 101
    // 1010
    // 10101
    public static void patternQuestion49(int n){
        System.out.print("\n--- Pattern 49 Output ---");

        for(int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                if(col%2==0) System.out.print(0);
                else System.out.print(1);
            }
            System.out.println(); // Next line
            }
        }
        // --- QUESTION 50: Inverted Right-Aligned Shift (With Spaces) ---
         // No-5
        // E D C B A
          // D C B A
            // C B A
              // B A
                // A
        public static void patternQuestion50(int n){
            System.out.println("\n--- Pattern 50 Output ---");

            for(int row=1;row<=n;row++){

                for(int space=1;space<row;space++) System.out.print("  ");

                for(int col=n-row+1;col>=1;col--) System.out.print((char)(col+64)+" ");

                System.out.println(); // Next line

            }
        }

         //--Question 51: Inverted Right-Aligned Shift (With Spaces) ---
            // No-5
            // E D C B A
            // A B C D
            // D C B
            // B A
            // A

        public static void patternQuestion51(int n) {
    System.out.println("\n--- Pattern 51 Output ---");

    for (int row = 1; row <= n; row++) {
        int length = n - row + 1; // Number of characters in this row

        if (row % 2 != 0) {
            // Odd Rows: Decreasing sequence
            // Starts at (n - row/2), length decreases
            int startVal = n - (row / 2);
            for (int i = 0; i < length; i++) {
                System.out.print((char) (startVal - i + 64) + " ");
            }
        } else {
            // Even Rows: Increasing sequence
            // Starts at (row/2), length decreases
            int startVal = row / 2;
            for (int i = 0; i < length; i++) {
                System.out.print((char) (startVal + i + 64) + " ");
            }
        }
        System.out.println(); // Next line
    }
}

 
    // --- MAIN METHOD ---
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        patternQuestion45(n);
        patternQuestion46(n);
        patternQuestion47(n);
        patternQuestion48(n);
        patternQuestion49(n);
        patternQuestion50(n);
        patternQuestion51(n);
    }
}
