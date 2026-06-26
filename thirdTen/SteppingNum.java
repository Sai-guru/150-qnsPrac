package thirdTen;

// Stepping Number or Not
// Neighbor number difference can be either -1 or 1
//  Input-1 = 12345
//  Output: Yes
//  Input-2 = 1245


public class SteppingNum {

    public static void isSteppingNumber(int n){

        String str = Integer.toString(n);

        for(int i=0;i<str.length()-1;i++){
            int curr = Character.getNumericValue(str.charAt(i));
            int next = Character.getNumericValue(str.charAt(i+1));

            if(curr-next != 1 && curr-next != -1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;

    }

    public static void main(String[] args) {
        // int num = 123;
        int num = 1245;
        isSteppingNumber(num);
    }

}
