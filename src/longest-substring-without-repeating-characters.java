import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int curLength = 0;
        int maxLength = 0;
        Set<Character> hashSet = new HashSet<Character>();
        while (right < s.length()) {
            if (!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right));
                curLength++;
                if (curLength > maxLength) {
                    maxLength = curLength;
                }
                right++;
            } else {
                while (hashSet.contains(s.charAt(right))) {
                    hashSet.remove(s.charAt(left));
                    left++;
                    curLength--;
                }
                hashSet.add(s.charAt(right));
                curLength++;
                right++;
            }
        }
        return maxLength;
    }
}