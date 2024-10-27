//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        int n = S.length();
        if(n==0 || n==1) return n;
        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        int maxlen=0;
        int l=0,r=0;
        char str[] = S.toCharArray();
        while(r<n)
        {
            if(hash[str[r]]!=-1)
            {
                if(hash[str[r]]>=l)
                {
                    l=hash[str[r]]+1;
                }
            }
        int len = r-l+1;
        maxlen=Math.max(maxlen,len);
        hash[str[r]]=r;
        r++;
        }
     return maxlen;   
    }
}