class Solution {
    public int minDeletionSize(String[] strs) {
        // 二维数组
        int row = strs.length; // 行
        int column = strs[0].length(); // 列
        int result = 0;
        for (int i = 0; i < column; i++) {
            for (int j = 1; j < row; j++) {
                if (strs[j - 1].charAt(i) > strs[j].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}