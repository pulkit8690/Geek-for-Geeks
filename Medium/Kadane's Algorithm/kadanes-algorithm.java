//{ Driver Code Starts
import java.io.*;

import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n)
    {
        long max_sum=Integer.MIN_VALUE;
        long count=0;
        long curr_sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                count++;
            }
        }
        if(count==n)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]>max_sum)
                {
                    max_sum=arr[i];
                }
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                curr_sum=curr_sum+arr[i];
                if(curr_sum<0)
                {
                    curr_sum=0;
                }
                if(curr_sum>max_sum)
                {
                    max_sum=curr_sum;
                }
            }
        }
        // Your code here
        return max_sum;
    }
    
    
}

