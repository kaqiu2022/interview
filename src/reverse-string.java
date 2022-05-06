class Solution {
    public void reverseString(char[] s) {
        int chaLength = s.length;
        char swap;
        for (int i = 0; i < chaLength / 2; i ++) {
            swap = s[i];
            s[i] = s[chaLength - 1 - i];
            s[chaLength - 1 - i] = swap;
        }
    }
}