/**
 * <herf></>https://leetcode.cn/problems/maximum-average-subarray-i/</herf>
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double curAvg = Integer.MIN_VALUE;
        int length = nums.length;

        int sum = 0;

        for (int i = 0; i <= k - 1; i++) {
            sum += nums[i];
            maxAvg = sum / (double) k;
        }

        if (length <= k) {
            return maxAvg;
        } else {
            for (int i = k; i < length; i++) {
                sum = sum - nums[i - k];
                curAvg = (sum + nums[i]) / (double) k;
                sum = sum + nums[i];
                if (maxAvg < curAvg) {
                    maxAvg = curAvg;
                }
                curAvg = Integer.MIN_VALUE;
            }
            return maxAvg;
        }
    }
}