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
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            if (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                return null;
            }

            if (slow == fast) {
                ListNode avg = head;  
                while (avg != slow) {
                    avg = avg.next;
                    slow = slow.next;
                } 
                return avg;            
            }
        }

        return null;
    }
}