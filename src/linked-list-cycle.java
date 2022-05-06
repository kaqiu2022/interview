import java.util.Set;
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// @solution-sync:begin
class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        ListNode cur = head;
        while (cur != null) {
            if (cur.next == null) {
                return false;
            } else {
                if (hashSet.contains(cur)) {
                    return true;
                } else {
                    hashSet.add(cur);
                    cur = cur.next;
                }
            }   
        }
        return false;
    }
}