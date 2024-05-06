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
// class Solution {
//     public ListNode removeNodes(ListNode head) {
//         ListNode temp=new ListNode(0);
//        temp.next=head;
//        ListNode prev=temp;
//        ListNode curr=head;

//        while(curr !=null){
//         ListNode t=curr.next;
//         boolean remcurr=false;
//         while(t!=null){
//         if(t.val>curr.val){
//             remcurr=true;
//             break;
//         }
//         t=t.next;
//         }
//         if(remcurr){
//             prev.next=curr.next;
//         }else{
//             prev=curr;
//         }
//         curr=curr.next;

//        }
//         return temp.next;

//             }
//         }

   class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        
        while (cur != null) {
            while (!stack.isEmpty() && stack.peek().val < cur.val) {
                ListNode a = stack.pop();
            }
            stack.push(cur);
            cur = cur.next;
        }
        
        ListNode nxt = null;
        while (!stack.isEmpty()) {
            cur = stack.pop();
            cur.next = nxt;
            nxt = cur;
        }
        
        return cur;
    }
}     