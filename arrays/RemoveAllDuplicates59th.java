package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Remove all duplicates in an array sample input and output
// Input:[1, 2, 2, 3, 4, 4, 5]
// Output:[1, 2, 3, 4, 5]

public class RemoveAllDuplicates59th {

    // public static void remDup(List<Integer> myArr){

    //     // Set<Integer> set = new HashSet<>();

    //     // for(int i=0;i<myArr.size();i++) set.add(myArr.get(i));
    //     // then can directly use inside the set declearation
    //      Set<Integer> set = new HashSet<>(myArr);

    //     System.out.println(set);

    // }



    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        // remDup(arr);
         // Set<Integer> set = new HashSet<>();

    //     // for(int i=0;i<myArr.size();i++) set.add(myArr.get(i));
    //     // then can directly use inside the set declaration
         Set<Integer> set = new HashSet<>(arr);

        System.out.println(set);
        
    }

}
