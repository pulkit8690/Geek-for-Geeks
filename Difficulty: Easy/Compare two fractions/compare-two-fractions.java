//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {
        // Code here
        String [] frac= str.split(", ");
        String [] frac1= frac[0].split("/");
        String [] frac2= frac[1].split("/");

        // numirator of frac1
        int a=Integer.parseInt(frac1[0]);
        // Denominator of frac1
        int b=Integer.parseInt(frac1[1]);
        // numirator of frac2
        int c=Integer.parseInt(frac2[0]);
        // Denominator of frac2
        int d=Integer.parseInt(frac2[1]);

        int left=a*d;
        int right=b*c;

        if(left>right)
        {
            return frac[0];
        }
        else if(right>left)
        {
            return frac[1];
        }
        else
        {
            return "equal";
        }
    }
}
