package arrays;


// Missing number in an array of shuffled order
// Input:[3, 7, 1, 2, 8, 4, 5]
// Output:6
import java.util.Scanner;

public class MissingNum56th {
    public static void main(String args[]){
        // int[] arr = {3, 7, 1, 2, 8, 4, 5};
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++) arr[i] = sc.nextInt();

        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int tot = 0;

        for(int i=0;i<n-1;i++) tot+=arr[i];

        System.out.println("Final ans : "+Math.abs(sum-tot));
    }

}
