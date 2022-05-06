import java.util.Set;
import java.util.HashSet;

// @solution-sync:begin
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i ++) {
            if (!hashSet.add(nums[i])) return true;
        }
        return false;
    }
}