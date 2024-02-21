/**
 * Problem: 167. Two Sum II - Input Array Is Sorted
 * Approach: Two Pointers and Compare
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 * n = length of integers array numbers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return null;
    }
}
