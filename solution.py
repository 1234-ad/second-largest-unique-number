def second_largest_unique(nums):
    """
    Find the second largest unique number in an array.
    
    Args:
        nums: List of integers
        
    Returns:
        int: Second largest unique number, or -1 if doesn't exist
        
    Time Complexity: O(n)
    Space Complexity: O(1)
    """
    if len(nums) < 2:
        return -1
    
    largest = float('-inf')
    second_largest = float('-inf')
    
    for num in nums:
        if num > largest:
            second_largest = largest
            largest = num
        elif num > second_largest and num < largest:
            second_largest = num
    
    return second_largest if second_largest != float('-inf') else -1


def test_solution():
    """Test cases for the solution"""
    test_cases = [
        ([3, 5, 2, 5, 6, 6, 1], 5),
        ([7, 7, 7], -1),
        ([1, 2], 1),
        ([5], -1),
        ([], -1),
        ([1, 1, 2, 2, 3], 2),
        ([10, 5, 8, 3, 9], 9)
    ]
    
    for i, (input_arr, expected) in enumerate(test_cases):
        result = second_largest_unique(input_arr)
        status = "✓" if result == expected else "✗"
        print(f"Test {i+1}: {status} Input: {input_arr} → Output: {result} (Expected: {expected})")


if __name__ == "__main__":
    print("Second Largest Unique Number - Python Solution")
    print("=" * 50)
    test_solution()