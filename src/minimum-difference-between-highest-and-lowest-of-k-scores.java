import java.util.*;

/**
 *<herf>https://leetcode.cn/problems/minimum-difference-between-highest-and-lowest-of-k-scores/</herf>
 */
class Solution {
    public int minimumDifference(int[] nums, int k) {
         Arrays.sort(nums);
         int min = Integer.MAX_VALUE;
         int length = nums.length;
         for (int i = 0; i < length - k + 1; i ++) {
            min = Math.min(min, nums[i + k - 1]  - nums[i]);
         }
         return min;
    }
}