/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        java.util.List<Integer> values = new java.util.ArrayList<>();

        // Collect values from list1
        while (list1 != null) 
        {
            values.add(list1.val);
            list1 = list1.next;
        }

        // Collect values from list2
        while (list2 != null) 
        {
            values.add(list2.val);
            list2 = list2.next;
        }

        // If both were empty
        if (values.isEmpty()) return null;

        // Sort all values
        java.util.Collections.sort(values);

        // Build new sorted list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
        
    }
}