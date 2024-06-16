//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        ArrayList <String> list= new ArrayList<>();
        //s=s.trim();
        int start=0;
        for(int end=0;end<S.length();end++)
        {
            if(S.charAt(end)=='.')
            {
                if(start!=end)
                {
                    list.add(S.substring(start, end));
                }
                start=end+1;
            }
            
        }
        // Add the last word
        if (start < S.length()) {
            list.add(S.substring(start));
        }
        // Step 4: Reverse the list of words
        StringBuilder reversedString = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedString.append(list.get(i));
            if (i > 0) {
                reversedString.append('.');
            }
        }
        
        return reversedString.toString();
    }
}