# Second Largest Unique Number

## Problem Statement
Given an array of integers, return the second largest unique number in the array. If it doesn't exist, return -1.

## Examples
```
Input: [3, 5, 2, 5, 6, 6, 1]
Output: 5

Input: [7, 7, 7]
Output: -1
```

## Approach
The solution uses a single-pass algorithm with O(n) time complexity:

1. **Track two variables**: `largest` and `secondLargest`
2. **Single iteration**: Process each element once
3. **Update logic**:
   - If current > largest: secondLargest = largest, largest = current
   - If current > secondLargest && current < largest: secondLargest = current
4. **Handle duplicates**: Skip elements equal to largest or secondLargest

## Time Complexity: O(n)
## Space Complexity: O(1)

## Solutions Available
- [Python](./solution.py)
- [JavaScript](./solution.js)
- [Java](./Solution.java)

## Test Cases
All implementations include comprehensive test cases covering:
- Normal case with duplicates
- All identical elements
- Array with only one unique element
- Empty array
- Single element array