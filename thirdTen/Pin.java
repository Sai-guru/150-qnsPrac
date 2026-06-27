package thirdTen;

// Given Inputs:
// input1 (Alpha) = 1234
// input2 (Beta)  = 5678
// input3 (Gamma) = 3245

// Position:  Thousands   Hundreds   Tens   Units
// Alpha:         1          2        3       4
// Beta:          5          6        7       8
// Gamma:         3          2        4       5
// Final Output Combination:
// Glue the 4 found digits together: 8, 2, 3, 4.
// Generated PIN = 8234

public class Pin {

    public static int createPIN(int a,int b,int g){

        String alp = Integer.toString(a);
        String bet = Integer.toString(b);
        String gam = Integer.toString(g);

        int[] minArr = new int[4];
        int max = Integer.MIN_VALUE;
        int pinVal = 0;

        for(int i=0;i<alp.length();i++){
            int minThousand = alp.charAt(i)-'0';
            int minHundred = bet.charAt(i)-'0';
            int minTen = gam.charAt(i)-'0';

            minArr[i] = Math.min(minThousand, Math.min(minHundred, minTen));
        }
        String grp = alp+bet+gam;
        // One-liner shortcut using Java Streams
        // int max = (alp + bet + gam).chars().max().getAsInt() - '0';

        for(int i=0;i<grp.length();i++){

            int curr = grp.charAt(i)-'0';
            if(curr>max) max = curr;
        }
        pinVal = (max*1000)+(minArr[1]*100)+(minArr[2]*10)+minArr[3];

        return pinVal;
    }

    public static void main(String[] args) {
        
        int alpha = 1234;
        int beta = 5678;
        int gamma = 3245;

        System.out.println(createPIN(alpha, beta, gamma)); // Outputs: 8234
    }

}
