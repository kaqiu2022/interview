class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (high -low) / 2 + low; 
            int midNum = nums[mid];
            if (midNum == target) {
                return mid;
            } else if (midNum > target) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}