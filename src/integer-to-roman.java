import java.lang.StringBuilder;

// @solution-sync:begin
class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if (num / 1000 > 0) {
                int tem = num / 1000;
                num = num % 1000;
                for (int i = 0; i < tem; i ++) {
                    sb.append("M");
                }
            } else if (num / 100 > 0) {
                if (num / 100 == 4) {
                    sb.append("CD");
                } else if (num / 100 == 9) {
                     sb.append("CM");
                } else if (num / 100 >= 5) {
                    sb.append("D");
                    int tem = num / 100 - 5;
                    for (int i = 0; i < tem; i ++) {
                        sb.append("C");
                    }
                } else if (num / 100 < 5) {
                    int tem = num / 100;
                    for (int i = 0; i < tem; i ++) {
                        sb.append("C");
                    }
                }
                num = num % 100;
            } else if (num / 10 > 0) {
                if (num / 10 == 4) {
                    sb.append("XL");
                } else if (num / 10 == 9) {
                     sb.append("XC");
                } else if (num / 10 >= 5) {
                    sb.append("L");
                    int tem = num / 10 - 5;
                    for (int i = 0; i < tem; i ++) {
                        sb.append("X");
                    }
                } else if (num / 10 < 5) {
                    int tem = num / 10;
                    for (int i = 0; i < tem; i ++) {
                        sb.append("X");
                    }
                }
                num = num % 10;
            } else {
                if (num == 4) {
                    sb.append("IV");
                } else if (num == 9) {
                     sb.append("IX");
                } else if (num >= 5) {
                    sb.append("V");
                    int tem = num - 5;
                    for (int i = 0; i < tem; i ++) {
                        sb.append("I");
                    }
                } else if (num  < 5) {
                    int tem = num;
                    for (int i = 0; i < tem; i ++) {
                        sb.append("I");
                    }
                }
                num = 0;
            }
        }
        return sb.toString();
    }
}