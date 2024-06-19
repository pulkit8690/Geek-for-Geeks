//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int sizeOfArray = Integer.parseInt(read.readLine());
            int arr[] = new int[sizeOfArray];

            String st[] = read.readLine().trim().split("\\s+");
            for (int i = 0; i < sizeOfArray; i++) arr[i] = Integer.parseInt(st[i]);

            int x = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.search(arr, sizeOfArray, x));
        }
    }
}
// } Driver Code Ends


class Solution {

    static int search(int arr[], int n, int x) {

        // Your code here
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}
