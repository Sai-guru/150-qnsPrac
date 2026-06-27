package thirdTen;

// To calculate the sum of non-prime index values, you need to sum up the values of an array at indices that are not prime nbers 
// (such as \(0, 1, 4, 6, 8,...)).

// Standard ExamplesExample 1: array = {10, 20, 30, 40, 50, 60} (Size = 6)
// Indices: 0, 1, 2, 3, 4, 5
// Prime Indices: 2, 3, 5 (Skip these values: 30, 40, 60)
// Non-Prime Indices: 0, 1, 4
// Calculation: {Value at 0} + {Value at 1} + {Value at 4} = 10 + 20 + 50 = {80}

public class SumOfNonPrimeIndexes {

    public static boolean isPrime(int n){

        if(n<=1) return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static int sumNonPrimeIndexValues(int []arr){

        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            if(!isPrime(i)) sum += arr[i]; // Add value at non-prime index
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        System.out.println(sumNonPrimeIndexValues(array)); 
        // ans is : 80
    }

}
