/**
 * Problem: 11. Container With Most Water
 * Approach: Two Pointer and calculation
 * Link: https://leetcode.com/problems/container-with-most-water/
 * n = length of integer array height
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxWater = 0;
        while (l < r) {
            int water = (r - l) * (Math.min(height[l], height[r]));
            maxWater = Math.max(maxWater, water);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}
