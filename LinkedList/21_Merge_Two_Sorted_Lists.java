/** My Solution - 100%, 81.61% */
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode combined = new ListNode();
        ListNode combinedPtr = combined;

        while(list1 != null || list2 != null){
            if(list1 == null){
                while(list2 != null){
                    combinedPtr.val = list2.val;
                    list2 = list2.next;
                    if(list2 != null){
                        combinedPtr.next = new ListNode();
                        combinedPtr = combinedPtr.next;
                    }
                }
                return combined;
            }
            if(list2 == null){
                while(list1 != null){
                    combinedPtr.val = list1.val;
                    list1 = list1.next;
                    if(list1 != null){
                        combinedPtr.next = new ListNode();
                        combinedPtr = combinedPtr.next;
                    }
                }
                return combined;
            }

            if(list1.val >= list2.val){
                combinedPtr.val = list2.val;
                list2 = list2.next;
            }else{
                combinedPtr.val = list1.val;
                list1 = list1.next;
            }
            
            if(list1 != null || list2 != null){
                combinedPtr.next = new ListNode();
                combinedPtr = combinedPtr.next;
            }
        }

        return combined;
    }
}
