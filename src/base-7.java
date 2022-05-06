import java.lang.StringBuilder;

// @solution-sync:begin
class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) {
            return "0";
        }

        int div = Math.abs(num);
        while (div / 7 != 0 || div % 7 != 0) {
            sb.insert(0,div % 7);
            div = div / 7;
        }
        if (num < 0) {
            sb.insert(0,"-");
        }
        return sb.toString();
    }
}