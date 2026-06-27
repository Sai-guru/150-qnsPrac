package thirdTen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Find Password (stable unstable):

// The goal is to calculate a final numeric password by 
// classifying a group of numbers as either Stable or Unstable,
//  finding their respective sums, 
// and calculating the difference between those sums.

// **1. Stable Number**
// A number is **Stable** if all digits appear the same number of times.

// **Examples:**
// **123**
// 1 → 1 time, 2 → 1 time, 3 → 1 time
// **Result:** Stable ✅

// **448899**
// 4 → 2 times, 8 → 2 times, 9 → 2 times
// **Result:** Stable ✅

// **7**
// 7 → 1 time
// **Result:** Stable ✅

// ---
// **2. Unstable Number**

// A number is **Unstable** if any digit appears a different number of times.

// **Examples:**

// **122**
// 1 → 1 time, 2 → 2 times
// **Result:** Unstable ❌

// **13133**
// 1 → 2 times, 3 → 3 times
// **Result:** Unstable ❌

// ip is n no of integers with spaces ok..
public class StableAndUnstable {

    public static boolean isStable(int n){

       Map<Character, Integer> map = new HashMap<>();
       String str = Integer.toString(n);

       for(int i=0;i<str.length();i++) {

        char curr = str.charAt(i);
        map.put(curr,map.getOrDefault(curr,0)+1);
       }

       for(int curr: map.values()) {
        if(curr != map.get(str.charAt(0))) return false;
       }
       return true;

       
    }

    public static int findPassword(int n1,int n2,int n3,int n4,int n5){

        int stableSum = 0,unstableSum = 0;
        List<Integer> numArr = Arrays.asList(n1,n2,n3,n4,n5);


        for(int i=0;i<numArr.size();i++) {
            int curr = numArr.get(i);

            if(isStable(curr)) stableSum+=curr;
            else unstableSum+=curr;
        }

        return stableSum-unstableSum;
    }

    public static void main(String[] args) {


        System.out.println(findPassword(12, 1313, 122, 2, 909));

    }

}
