package freqBased;

import java.util.HashMap;
import java.util.Map;

// 60. Frequency count with descending order printing
// int a[] = { 50, 20, 150, 20, 50, 10, 30, 10, 10 };

// 63. Program to find the frequency count of every number in an array in ascending
// order
// Input={40,20,10,50,20,10,30,40}
// 50->1
// 30->1
// 40->2
// 20->2
// 10->2

public class freqCountAscDesc {

    public static void freqCAsc(int arr[]){
         
        Map<Integer,Integer> map = new HashMap<>();

        for(int curr: arr) map.put(map.get(curr),map.getOrDefault(curr,0)+1);




        
    }


    public static void freqCDesc(int arr[]){
         
        Map<Integer,Integer> map = new HashMap<>();

        for(int curr: arr) map.put(map.get(curr),map.getOrDefault(curr,0)+1);




        
    }

    public static void main(String[] args) {
        

    }

}
