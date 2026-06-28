package arrays;

// Input:[12, 35, 1, 10, 34, 1]
// Output:34

public class SecondLargest57th {
    public static void main(String args[]){

        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int curr = arr[i];

            if(curr>largest) {
                secondLargest = largest;
                largest = curr;
            }

            if(curr>secondLargest && curr<largest) secondLargest = curr;
        }
        System.out.println(secondLargest);
    }

}
