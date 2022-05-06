import java.lang.StringBuilder;

// @solution-sync:begin
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index < 0) {
            return word;
        } else {
            StringBuilder sb = new StringBuilder();
            String sub = word.substring(0, index + 1);
            sb.append(sub).reverse();
            sb.append(word.substring(index + 1));
            return sb.toString();
        }
    }
}