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
        // Optimal Solution:
        // Dummy node to start the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        ListNode p1 = list1;
        ListNode p2 = list2;

        // Merge while both lists have nodes
        while (p1 != null && p2 != null) 
        {
            if (p1.val <= p2.val) 
            {
                tail.next = p1;    // attach p1
                p1 = p1.next;      // move p1
            } 
            else 
            {
                tail.next = p2;    // attach p2
                p2 = p2.next;      // move p2
            }
            tail = tail.next;      // move tail
        }

        // Attach any remaining nodes
        if (p1 != null) 
        {
            tail.next = p1;
        } 
        else if (p2 != null) 
        {
            tail.next = p2;
        }

        // First real node is dummy.next
        return dummy.next;


        // // Brute force solution
        // java.util.List<Integer> values = new java.util.ArrayList<>();

        // // Collect values from list1
        // while (list1 != null) 
        // {
        //     values.add(list1.val);
        //     list1 = list1.next;
        // }

        // // Collect values from list2
        // while (list2 != null) 
        // {
        //     values.add(list2.val);
        //     list2 = list2.next;
        // }

        // // If both were empty
        // if (values.isEmpty()) return null;

        // // Sort all values
        // java.util.Collections.sort(values);

        // // Build new sorted list
        // ListNode dummy = new ListNode(0);
        // ListNode current = dummy;
        // for (int val : values) {
        //     current.next = new ListNode(val);
        //     current = current.next;
        // }

        // return dummy.next;
        
    }
}