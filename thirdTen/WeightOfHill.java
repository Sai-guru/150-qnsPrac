package thirdTen;

// Example
// If input1 = 3, 
// input2 = 1 (Head Level),
// and input3 = 5 (Increment):
// Row 0: Weight 1 (repeated 1 time) = 1
// Row 1: Weight 1 + 5 = 6 (repeated 2 times) = 6 + 6 = 12
// Row 2: Weight 6 + 5 = 11 (repeated 3 times) = 11 + 11 + 11 = 33
// Total Weight: 1 + 12 + 33 = 46

public class WeightOfHill {

    public static int totalHillWeight(int totRows, int baseWeight, int weightIncr) {
        
        int totalWeight = 0;

        for (int row = 1; row <= totRows; row++) {
            // Level 'row' has exactly 'row' elements
            totalWeight += (row * baseWeight);
            // Increase the row weight for the next level down
            baseWeight += weightIncr;
        }
        return totalWeight;
    }

    public static void main(String[] args) {
    
        int totalWeight = totalHillWeight(5, 10, 2); // Example: 5 levels, starting weight 10, increment 2
        System.out.println(totalWeight);
    }

}
