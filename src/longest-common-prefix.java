class Solution {
    public String longestCommonPrefix(String[] strs) {
        int mixLengthString = strs[0].length();
        int mixLengthIndex = 0;
        for (int i = 1; i < strs.length; i ++) {
            mixLengthString = mixLengthString < strs[i].length() ? mixLengthString:strs[i].length();
            mixLengthIndex = i ;
        }
        for (int i = mixLengthString; i >= 0; i --) {
            String sub = strs[mixLengthIndex].substring(0, i);
            int j = 0;
            while (sub.equals(strs[j].substring(0, i))) {
                if (j == strs.length -1) return sub;
                j++;
            }
        }  
        return ""; 
    }
}