

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode x= null;
        ListNode y = head;
        
        while (y != null) {
            ListNode nextNodes = y.next;
            y.next = x;     
            x = y;
            y = nextNodes;
        }
        
        return x; 
    }
}