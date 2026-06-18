
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        
        ListNode slowPointer = dummyNode;
        ListNode fastPointer = dummyNode;
        
        for (int i = 0; i < n; i++) {
            fastPointer = fastPointer.next;
        }
        
        
        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        
        slowPointer.next = slowPointer.next.next;
        
        return dummyNode.next;
    }
}