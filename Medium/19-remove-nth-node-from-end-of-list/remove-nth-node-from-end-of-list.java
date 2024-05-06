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
        int len=findLength(head);
        int start=0;int end =len-n-1;
        if(end==-1)return head.next;
        ListNode temp= head;
        while(start<end){
            temp=temp.next;
            start++;
        } 
        temp.next=temp.next.next;
        return head;
    }

    public int findLength(ListNode head){
        int cut=0;
        if(head==null)return cut;
        ListNode curr=head;
        while(curr!=null){
            cut++;
            curr=curr.next;
        }
        return cut;
    }
}