//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution s = new Solution();
            System.out.println(s.search(n, k, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int search(int n, int k, int[] arr) {

        // code here
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                return i+1;
            }
        }
        return -1;
    }
}