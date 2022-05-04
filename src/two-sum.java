import java.util.HashMap;
import java.util.Map;

// @solution-sync:begin
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> temp = new HashMap<Integer, Integer>();
        int[] result = new int[2] ;
        for (int i = 0; i < nums.length; i ++) {
            int sub = target - nums[i];
            if (temp.containsKey(sub)) {
                result[1] = i;
                result[0] = temp.get(sub);
            }
            temp.put(nums[i], i);
        }
        return result;
    }
}