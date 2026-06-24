package firstTen;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;


public class DigitCounts {

    public static int countDigits(int n){

        int count = 0;
        if(n<=0) return 1;

        while(n!=0){
            n/=10;
            count++;
        }
        return count;

        // //using string conversion and for loop
        // String str = Integer.toString(n);
        // return str.length();
    }

    // Unique Digits Count
    public static int countUniqueDigits(int n) {
        
        Set<Integer> set = new HashSet<>();

        if(n==0) return 1;

        while(n>0) {
            int curr = n%10;
            set.add(curr);
            n/=10;
        }
        return set.size();
    }

    //  Non-Repeated Digits’ Count:
    public static int countNonRep(int n){

        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        if(n==0) return 1;

        while(n>0){
            int curr = n%10;
            map.put(curr,map.getOrDefault(curr,0)+1);
            n/=10;
        }
        for(int val:map.values()){
            if(val==1) count++;
        }
        return count;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(countDigits(num));
        System.out.println(countNonRep(num));
        System.out.println(countUniqueDigits(num));

    }

}
