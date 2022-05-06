class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1; 
        int carry = 1; //个位初始 +1

        while(i >= 0) {
            int digit = (digits[i] + carry) % 10; //计算当前位的值
            carry = (digits[i] + carry) / 10; // 计算是否需要进位
            digits[i] = digit;
            i --;
        }

        if (carry <= 0) {
            return digits;
        } else {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }
    }
}