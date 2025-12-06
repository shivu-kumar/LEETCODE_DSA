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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(n==1 && len==1)
        return null;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode cur = dummy;
        if(len-n==0)
        return dummy.next.next;
        for(int i=0;i<len-n;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;


        return dummy.next;

    }
}