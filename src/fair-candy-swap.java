import java.util.Set;
import java.util.HashSet;

// @solution-sync:begin
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < A.length; i ++) {
            sumA += A[i];
        }
        for (int j = 0; j < B.length; j ++) {
             sumB += B[j];
        }
        Set<Integer> setB = new HashSet();
        for (int x = 0; x< B.length; x ++) {
            setB.add(B[x]);
        }
        
        for (int y = 0; y < A.length; y ++){
            if (setB.contains( A[y] - (sumA - sumB) / 2) )
            return new int[]{A[y], A[y] - (sumA - sumB)  / 2 };
        }

         return new int[]{-1, -1};
    }
}