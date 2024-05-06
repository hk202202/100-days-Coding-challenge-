//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    static String preToInfix(String str) {
        // code here
        int k=str.length();
        Stack<String>st=new Stack<>();
        
        for(int i=k-1;i>=0;i--){
             char ch=str.charAt(i);
             if(Character.isLetter(ch)){
                 st.push(String.valueOf(ch));
             }
            else if(ch=='*'||ch =='/'||ch =='-'||ch=='+'||ch=='^'){
                    String top1=st.pop();
                    String top2=st.pop();
                    String cal="("+top1+ch+top2+")";
                    st.push(cal);
            }
            }
            return st.peek();
        }
}
