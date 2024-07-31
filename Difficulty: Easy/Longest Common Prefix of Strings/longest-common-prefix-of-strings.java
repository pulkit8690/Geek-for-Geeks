//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        String s1= arr[0];
        String s2=arr[arr.length-1];
        int i=0;
        while(i<s1.length())
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                i++;
            }
            else{
                break;
            }
        }
        return i==0 ? "-1" : s1.substring(0,i);
        
    }
}