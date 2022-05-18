class Solution {
    public boolean oneEditAway(String first, String second) {
        int firstLen = first.length();
        int secondLen = second.length();
        if (firstLen > secondLen) {
            return oneEditAway(second, first);
        }

        if (Math.abs(firstLen - secondLen) > 1) {
            return false;
        }
        int i = 0, j = 0, res = 0;
        while (i < firstLen && j < secondLen && res < 2) {
            if (first.charAt(i) == second.charAt(j)) {
                i++;
                j++;
            } else {
                if (firstLen == secondLen) { //替换
                    i++;
                    j++;
                    res++;
                } else {//添加
                    j++;
                    res++;
                }
            }
        }
        return res <= 1;
    }
}