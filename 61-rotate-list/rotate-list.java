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

     public int size(ListNode head){
        int cut=0;
        while(head!=null){
            cut++;
            head=head.next;
        }
        return cut;
     }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int cut=size(head);
        k=k%cut;
        if(k==0)return head;

        int Rota=cut-k-1;
        ListNode temp=head;
        for(int i=0;i<Rota;i++){
          temp=temp.next;
        }

        ListNode start=temp.next;
        temp.next=null;

        temp=start;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        return start;
    }
       
    }