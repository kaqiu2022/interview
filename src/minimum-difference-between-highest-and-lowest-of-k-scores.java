import java.util.Arrays;

// @solution-sync:begin
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

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