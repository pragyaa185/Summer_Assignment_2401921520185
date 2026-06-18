class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;}
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        ListNode 1HalfPointer = head;
        ListNode 2HalfPointer = prev; // Reversed list ka head
        
        while (2HalfPointer != null) {
            if (1HalfPointer.val != 2HalfPointer.val) {
                return false;
            }
            1HalfPointer = 1HalfPointer.next;
            2HalfPointer = 2HalfPointer.next;
        }
        
        return true;
    }
}