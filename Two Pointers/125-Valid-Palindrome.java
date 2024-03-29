/**
 * Problem: 125. Valid Palindrome
 * Approach: Convert String and Two Pointer
 * Link: https://leetcode.com/problems/valid-palindrome/description/
 * n = length of the input string s
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
