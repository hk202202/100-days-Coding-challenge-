//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer>x=new Stack<>();
    	for(int i=0;i<n;i++){
    	    x.push(i);
    	}
    	while(x.size()>1){
    	    int a=x.pop();
    	    int b=x.pop();
    	    if(M[a][b]==0)x.push(a);
    	    else if(M[b][a]==0)x.push(b);
    	}
    	if(x.size()==0)return -1;
    	int v=x.pop();
    	for(int i=0;i<n;i++){
    	    if(M[v][i]==1)return -1;
    	}
    	
        	for(int j=0;j<n;j++){
        	    if(j==v)continue;
    	    if(M[j][v]==0)return -1;
        	}
        	return v;
    }
}