class Solution {
    public int strStr(String haystack, String needle) {
        int pLength = needle.length();
        int sLength = haystack.length();
        if (sLength < pLength) {
            return -1;
        } else if (pLength == sLength) {
            if (!haystack.equals(needle)) {
                return -1;
            } else {
                return 0;
            }
        } else {
            for (int i = pLength - 1; i < sLength; i++) {
                String subString = haystack.substring(i - pLength + 1, i + 1);
                if (needle.equals(subString)) {
                    return i - pLength + 1;
                }
            }
            return -1;
        }
    }
}