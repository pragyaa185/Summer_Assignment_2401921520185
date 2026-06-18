

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyStart = new ListNode(-1); 
        ListNode currentAnchor = dummyStart;
        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentAnchor.next = list1;
                list1 = list1.next;
            } else {
                currentAnchor.next = list2;
                list2 = list2.next;
            }
            currentAnchor = currentAnchor.next;
        }
      
        if (list1 != null) {
            currentAnchor.next = list1;
        } else {
            currentAnchor.next = list2;
        }
        
        return dummyStart.next;
    }
}