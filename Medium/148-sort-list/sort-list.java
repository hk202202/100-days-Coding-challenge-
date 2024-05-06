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
    public ListNode sortList(ListNode head) {
        int cut=0;
        ListNode temp=head;

        while(temp!=null){
            cut++;
            temp=temp.next;
        }
        int []arr=new int[cut];
        temp=head;
        cut=0;
        while(temp!=null){
            arr[cut++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);
        temp=head;
        cut=0;
        while(temp!=null){
            temp.val=arr[cut++];
            temp=temp.next;
        }
        return head;
    }
}