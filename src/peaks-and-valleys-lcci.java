import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
//        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 1) {
                if (nums[i] < nums[i -1]) {
                    int swap = 0;
                    swap = nums[i-1];
                    nums[i -1] = nums[i];
                    nums[i] = swap;
                }
            } else {
                if (nums[i] > nums[i -1]) {
                    int swap = 0;
                    swap = nums[i-1];
                    nums[i -1] = nums[i];
                    nums[i] = swap;
                }
            }
        }
    }
}