//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int arr[]=new int[2];
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            num=num^nums[i];
        }
        int rightmost= num & -num;
        int b1=0;
        int b2=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & rightmost)!=0)
            {
                b1=b1^nums[i];
            }
            else
            {
                b2=b2^nums[i];
            }
        }
        if(b1<b2)
        {
            arr[0]=b1;
            arr[1]=b2;
        }
        else
        {
            arr[0]=b2;
            arr[1]=b1;
        }
        return arr;
        
    }
}