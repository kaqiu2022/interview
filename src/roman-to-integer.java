class Solution {
    public int romanToInt(String s) {
        int i = 0;
        int res = 0;
        for (; i < s.length() -1 ; i ++) {
            int a = this.getInt(s.charAt(i));
            int b = this.getInt(s.charAt(i + 1));
            if (a < b) {
                res -= a;
            } else {
                res += a;
            }
        }
        return res + this.getInt(s.charAt(s.length() - 1));

    }
    
    private int getInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}