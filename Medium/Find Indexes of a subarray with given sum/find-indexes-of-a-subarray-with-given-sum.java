//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0,i=0,j=0;
        for(i=0;i<n;i++){
            sum+=arr[i];
            while(j<n && sum>s){ //i=right index 
                sum -=arr[j];
                j++;
            }
            if(sum==s && i>=j){ // j=left index
                 ans.add(j+1);  //i based index (1);
                ans.add(i+1);
                break;
            }
        }
        if(ans.size()==0 ||j>i){
            ans.clear();  // when there is no subarray present equals to s
            ans.add(-1); // so add -1 to ans;
        }
        
        return ans;
    //     int left=0;
    //     int sum=0;
    //     for(int i=0;i<n;i++){
            
            
    // //         sum+=arr[i];
    // //         while(sum>s){
    // //         if(left==i){
    // //             sum=arr[i];
    // //             break;
    // //         } if((sum-= arr[left++])==0) break;
            
    // //         } if(sum==s) return new ArrayList(List.of(left+1,i+i));
    // //     }
    // // return new ArrayList(List.of(-1));
}
}