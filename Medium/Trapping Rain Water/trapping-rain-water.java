//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int left_max[]=new int[n];
        left_max[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left_max[i]=Math.max(arr[i],left_max[i-1]);
        }
        int right_max[]=new int[n];
        right_max[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--)
        {
            right_max[j]=Math.max(arr[j],right_max[j+1]);
        }
        long water_trapped=0;
        for(int i=0;i<n;i++)
        {
            long water_level= Math.min(left_max[i],right_max[i]);
            water_trapped+=water_level-arr[i];
        }
        return water_trapped;
    } 
}


