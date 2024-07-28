//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String str) {
        // code here
        HashMap<Character,Integer> map= new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                ans.append(str.charAt(i));
                map.remove(str.charAt(i));
            }
        }
        return ans.toString();
    }
}