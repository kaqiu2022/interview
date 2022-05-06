class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int length = nums.length;
        int curLength = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 1) {
                curLength++;
            } else {
                maxLength = maxLength < curLength ? curLength : maxLength;
                curLength = 0;
            }
        }
        maxLength = maxLength < curLength ? curLength : maxLength;
        return maxLength;
    }
}