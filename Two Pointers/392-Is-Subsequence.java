/**
 * Approach: Loop through string and compare
 * Link: https://leetcode.com/problems/is-subsequence/description/
 * n = length of string t
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (index == s.length()) {
                return true;
            }
            if (s.charAt(index) == t.charAt(i)) {
                index++;                
            }
        }
        return index == s.length();
    }
}
