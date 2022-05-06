class Solution {
    public int climbStairs(int n) {
        int[] s = new int[n + 1];
        if (n == 1) return 1;
        if (n == 2) return 2;
        s[0] = 0;
        s[1] = 1;
        s[2] = 2;
        for (int i = 3; i <= n; i ++) {
          s[i] = s[i -1] + s[i - 2];  
        }
        return s[n];
    }
}