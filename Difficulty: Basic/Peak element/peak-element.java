//{ Driver Code Starts
import java.util.*;
import java.io.*;
class PeakElement{
	public static void main(String[] args)throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
			int n=Integer.parseInt(in.readLine().trim());
			int[] a=new int[n];
		    int[] tmp=new int[n];
		    String s[]=in.readLine().trim().split(" ");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(s[i]);
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=(new Solution()).peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    out.println(f);
			}
		}
		out.close();
	}
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array arr[]
    public int peakElement(int[] arr, int n)
    {
        return findPeakElement(arr, 0, n - 1, n);
    }

    // Helper function to find the peak element using recursion
    private int findPeakElement(int[] arr, int start, int end, int n)
    {
        int mid = start + (end - start) / 2;

        // Check if mid is a peak element
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
            return mid;
        }
        // If the element on the left side is greater than mid, then the peak element is in the left half
        else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeakElement(arr, start, mid - 1, n);
        }
        // If the element on the right side is greater than mid, then the peak element is in the right half
        else {
            return findPeakElement(arr, mid + 1, end, n);
        }
    }
}
