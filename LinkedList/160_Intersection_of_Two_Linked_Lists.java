/** My Solution - 8.44%, 47.98% */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != null || tempB != null) {
            while(tempA != tempB && tempB != null) {
                tempB = tempB.next;
            }

            if(tempA != null && tempB == null) {
                tempA = tempA.next;
                tempB = headB;
            }
            else {
                return tempB;
            }
        }

        return null;
    }
}