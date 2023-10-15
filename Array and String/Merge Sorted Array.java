class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = Arrays.copyOfRange(nums1, 0, m);
        int p1 = 0;
        int p2 = 0;
        while (p1 < m && p2 < n) {
            if (temp[p1] < nums2[p2]) {
                nums1[p1 + p2] = temp[p1];
                p1++;
            } else {
                nums1[p1 + p2] = nums2[p2];
                p2++;
            }
        }
        while (p1 < m) {
            nums1[p1 + p2] = temp[p1];
            p1++;
        }
        while (p2 < n) {
            nums1[p1 + p2] = nums2[p2];
            p2++;
        }
    }
}