package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Re-arranged array by small – largest combination
// Input: [1, 3, 5, 2, 8, 7, 4]
// Output:[1, 8, 2, 7, 3, 5, 4]

public class RearrangedArrayCombo58th {


    public static void smallLargest(List<Integer> myArr){

        List<Integer> resArr = new ArrayList<>();
    
    while(!myArr.isEmpty()){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

         for(int i=0;i<myArr.size();i++){
            int curr = myArr.get(i);

            if(curr<smallest) smallest = curr;
            if(curr>largest) largest = curr;

        }
        resArr.add(smallest);
        myArr.remove(Integer.valueOf(smallest));

        if(myArr.isEmpty()) break;

        resArr.add(largest);
         myArr.remove(Integer.valueOf(largest));

    }
    System.out.println(resArr);
}
    public static void main(String[] args){
        // int[] arr = {1, 3, 5, 2, 8, 7, 4};
         List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 8, 7, 4));

         smallLargest(list);


    }

}
