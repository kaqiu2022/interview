class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// @solution-sync:begin
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0); 
        ListNode cursor = head;
        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cursor.next = list1;
                cursor = cursor.next;
                list1 = list1.next;
            } else {
                cursor.next = list2;
                cursor = cursor.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            cursor.next = list2;
        } else {
            cursor.next = list1;
        }
        return head.next;
    }
}