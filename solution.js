/**
 * Find the second largest unique number in an array
 * @param {number[]} nums - Array of integers
 * @returns {number} Second largest unique number, or -1 if doesn't exist
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
function secondLargestUnique(nums) {
    if (nums.length < 2) {
        return -1;
    }
    
    let largest = -Infinity;
    let secondLargest = -Infinity;
    
    for (const num of nums) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num < largest) {
            secondLargest = num;
        }
    }
    
    return secondLargest === -Infinity ? -1 : secondLargest;
}

/**
 * Test cases for the solution
 */
function testSolution() {
    const testCases = [
        [[3, 5, 2, 5, 6, 6, 1], 5],
        [[7, 7, 7], -1],
        [[1, 2], 1],
        [[5], -1],
        [[], -1],
        [[1, 1, 2, 2, 3], 2],
        [[10, 5, 8, 3, 9], 9]
    ];
    
    console.log("Second Largest Unique Number - JavaScript Solution");
    console.log("=".repeat(50));
    
    testCases.forEach((testCase, index) => {
        const [input, expected] = testCase;
        const result = secondLargestUnique(input);
        const status = result === expected ? "✓" : "✗";
        console.log(`Test ${index + 1}: ${status} Input: [${input}] → Output: ${result} (Expected: ${expected})`);
    });
}

// Run tests if this file is executed directly
if (typeof require !== 'undefined' && require.main === module) {
    testSolution();
}

// Export for use in other modules
if (typeof module !== 'undefined' && module.exports) {
    module.exports = { secondLargestUnique, testSolution };
}