/** My Solution - 15.61%, 47.54% */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        
        HashSet<ListNode> visited = new HashSet<>();
        ListNode curr = head;

        while(curr.next != null){
            ListNode next = curr.next;
            if(visited.contains(next)) return true;

            visited.add(curr);
            curr = next;
        }

        return false;
    }
}

/** Solution */
public boolean hasCycle(ListNode head) {
  ListNode slow = head, fast = head;
  
  while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    
    if (slow == fast) 
        return true;
  }
  
  return false;
}
