class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0; // Initialize ans as 0
        for (final int n : nums) // Iterate over each element in nums
            ans ^= n; // Perform XOR operation

        return ans; // Return the single number
    }
}
