class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) return s;
        
        int maxSubString = 1;
        int beginIndex = 0;
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i< length; i ++) {
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        for (int j = 1; j < length; j ++) {
            for (int i = 0; i < j; i ++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;  
                } else {
                    if (j - i  < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxSubString) {
                    maxSubString = j - i + 1;
                    beginIndex = i;
                }
            }  
        }
        return s.substring(beginIndex, beginIndex + maxSubString);
     }
}