
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode x = head;
        ListNode y = head;
        
        while (y != null && y.next != null) {
            x= x.next;         
            y = y.next.next;               
           
            if (x == y) {
                return true;
            }
        }
        
        return false; 
    }
}