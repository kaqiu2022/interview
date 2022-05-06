import java.lang.StringBuilder;

// @solution-sync:begin
class Solution {
    public String toHex(int num) {
        long c = 1L << 32 ;
        String[] tab = new String[]{"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        long absolute = num < 0 ? c  + num  : num;
        StringBuilder sb = new StringBuilder();

        if (absolute == 0 ) return "0";

        while (absolute > 0) {
            sb.insert(0, tab[(int)(absolute % 16)]);
            absolute = absolute / 16;
        }
        return sb.toString();
    }
}