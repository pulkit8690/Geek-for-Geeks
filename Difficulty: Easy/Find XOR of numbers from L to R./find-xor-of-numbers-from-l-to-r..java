//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        return XOR(l-1) ^ XOR(r);
        
    }
    private static int XOR(int N)
    {
        if(N%4==1)
        {
            return 1;   
        }
        else if(N%4==2)
        {
            return N+1;
        }
        else if(N%4==3)
        {
            return 0;
        }
        else
        {
            return N;
        }
    }
}