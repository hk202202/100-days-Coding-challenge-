//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking count of total testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            int n, m;

            // taking count of elements in array a
            n = sc.nextInt();

            // taking count of elements in array b
            m = sc.nextInt();

            // Creating 2 arrays of n and m
            int a[] = new int[n];
            int b[] = new int[m];

            // inserting elements to array a
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // inserting elements to array b
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling NumberofElementsInIntersection method
            // and printing the result
            System.out.println(ob.NumberofElementsInIntersection(a, b, n, m));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> a1=new HashSet<>();
         HashSet<Integer> b1=new HashSet<>();
         
         for(int val:a){
             a1.add(val);
         }
         
         for(int val:b){
             b1.add(val);
         }
         int cut=0;
         for(int i=0;i<n;i++){
             if(a1.contains(a[i])&& b1.contains(a[i])){
                 cut++;
                 a1.remove(a[i]);
                 b1.remove(a[i]);
             }
         }
         return cut;
    }
}
