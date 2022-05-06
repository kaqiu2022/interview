import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// @solution-sync:begin
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode p = head;
        if(head == null || head.next == null) {
            return head;
        }

        while(p != null) {
            stack.push(p);
            p = p.next;
        }
        ListNode headRev = new ListNode(-1);
        p = headRev;

        while(! stack.isEmpty()) {
            p.next = stack.pop();
            p = p.next;
        }
        p.next = null;
        return headRev.next;
    }
}