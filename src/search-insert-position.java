class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int len = right - left + 1;
            if (len % 2 == 0) {
                int midLeftIndex = left + len / 2 - 1;
                int midRightIndex = left + len / 2;
                if (target < nums[midLeftIndex]) {
                    right = midLeftIndex;
                } else if (target > nums[midRightIndex]) {
                    left = midRightIndex;
                } else if (target == nums[midLeftIndex]) {
                    return midLeftIndex;
                } else  {  // (midLeftIndex, midRightIndex]
                    return midRightIndex;
                }
            } else {
                int midIndex = left + len / 2;
                if (target == nums[midIndex]) {
                    return midIndex;
                } else if (target > nums[midIndex]) {
                    left = midIndex;
                } else {
                    right = midIndex;
                }
            }
        }
        return target > nums[left] ? left + 1 : 0; // 左右指针重合
    }
}