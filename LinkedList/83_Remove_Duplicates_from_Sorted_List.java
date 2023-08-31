/** My Solution - 100%, 90.6% */

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head;

        while(ptr != null){
            int curr = ptr.val;
            ListNode temp = ptr.next;

            while(temp != null && temp.val == curr){
                temp = temp.next;
            }

            ptr.next = temp;
            ptr = ptr.next;
        }

        return head;
    }
}
