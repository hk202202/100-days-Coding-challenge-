class MinStack {
//   private Node head;
int min=Integer.MAX_VALUE;
Stack <Integer> st=new Stack<>(); 
    
    
    public void push(int x) {
    //    if(head==null){
    //     head= new Node(x,x,null);
    //    }else
    //    head=new Node(x,Math.min(x,head.min),head);
    if(x<=min){
        st.push(min);
        min=x;   
    }
    st.push(x);
}
    
    public void pop() {
        // head=head.next;
        if(st.pop()==min) min=st.pop();
    }
    
    public int top() {
        // return head.val;
        return st.peek();
    }
    
    public int getMin() {
        // return head.min;
        return min;
    }
    // private class Node{
    //     int val;
    //     int min;
    //     Node next;

    //     private Node(int val,int min,Node next){
    //         this.val=val;
    //         this.min=min;
    //         this.next=next;
        // 
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */