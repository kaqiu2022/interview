class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// @solution-sync:begin
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fake = new ListNode(-1); // 创建一个指向头结点的空节点

        fake.next = head;
        ListNode pre = fake;
        ListNode cur = head;
        ListNode n = head.next;
        int flag = 0; // 有重复元素比较标志
        while(n != null) {
            while (n != null && cur.val == n.val) {
                n = n.next;
                flag = 1;
            }
                
            if (flag == 1) {
                pre.next = n;
                cur = n;
                flag = 0;
            } else {
                pre.next = cur;
                pre = cur;
                cur = n;

            }
            if (n != null){
                n = n.next;
            }
        }
        return fake.next;
    }
}