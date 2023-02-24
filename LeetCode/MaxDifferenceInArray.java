//Solution for Maximum Difference Between Increasing Elements Problem in LeetCode
//Question - https://leetcode.com/problems/maximum-difference-between-increasing-elements
class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int diff = -1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                int d = nums[i] - min;
                diff = Math.max(diff, d);
            } else {
                min = nums[i];
            }
        }
        
        return diff;
    }
}
