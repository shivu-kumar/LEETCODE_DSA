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
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = head;
        ListNode cur  = head;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        int count = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
       ListNode newhead = reverse(slow);
       slow=head;
        for(int i = 0; i<count;i++){
            if(slow.val!=newhead.val){
                return false;
            }
            slow=slow.next;
            newhead=newhead.next;

        }
        return true;

    }
}