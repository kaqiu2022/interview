import java.util.List;
import java.util.ArrayList;

// @solution-sync:begin
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i <= right; i ++) {
            int j = i;
            int k = -1;
            int l = -1;
            while(j != 0 && j % 10 != 0) {
                k = j % 10;
                l = i % k;
                if (l != 0) break;
                j = j / 10;
                if (j != 0 && j % 10 == 0)  {
                    l = -1;
                    break;
                }
            }
            if (l == 0) {
                result.add(i);
            }
        }   
        return result;
    }
}