import java.util.Set;
import java.util.HashSet;

// @solution-sync:begin
class Solution {
    public boolean isUnique(String astr) {
        HashSet<Character> hashSet = new HashSet<Character>();
        for (char c : astr.toCharArray()) {
            if (!hashSet.add(c)) {
                return false;
            }
         }
         return true;
    }
}