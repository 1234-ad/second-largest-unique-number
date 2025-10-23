import java.util.Arrays;

/**
 * Solution for finding the second largest unique number in an array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Solution {
    
    /**
     * Find the second largest unique number in an array
     * @param nums Array of integers
     * @return Second largest unique number, or -1 if doesn't exist
     */
    public static int secondLargestUnique(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
    
    /**
     * Test cases for the solution
     */
    public static void testSolution() {
        int[][] testInputs = {
            {3, 5, 2, 5, 6, 6, 1},
            {7, 7, 7},
            {1, 2},
            {5},
            {},
            {1, 1, 2, 2, 3},
            {10, 5, 8, 3, 9}
        };
        
        int[] expectedOutputs = {5, -1, 1, -1, -1, 2, 9};
        
        System.out.println("Second Largest Unique Number - Java Solution");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < testInputs.length; i++) {
            int result = secondLargestUnique(testInputs[i]);
            String status = result == expectedOutputs[i] ? "✓" : "✗";
            System.out.printf("Test %d: %s Input: %s → Output: %d (Expected: %d)%n", 
                            i + 1, status, Arrays.toString(testInputs[i]), result, expectedOutputs[i]);
        }
    }
    
    /**
     * Main method to run tests
     */
    public static void main(String[] args) {
        testSolution();
    }
}