//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        String s="true";
        int N=n;
        int ans=0;
        // code here
        while(n>0)
        {
            int temp=n%10;
            int cube= temp*temp*temp;
            ans=ans+cube;
            n=n/10;
        }
        if(ans==N)
        {
            s="true";
        }
        else
        {
            s="false";
        }
        return s;
    }
}