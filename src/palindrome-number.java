import java.util.List;
import java.util.ArrayList;

// @solution-sync:begin
class Solution {
    public boolean isPalindrome(int x) {
        List<Integer> intToList = new ArrayList<Integer>();

        int temp = x; 
        while (temp != 0) {
            if (temp < 0 ) return false;
            intToList.add(temp % 10);
            temp = temp / 10;
        }
 
        for (int i = 0; i < (intToList.size() / 2); i ++){
            if(intToList.get(i) != intToList.get(intToList.size() -1 - i)) return false;
        }
   
        return true;
    }
}