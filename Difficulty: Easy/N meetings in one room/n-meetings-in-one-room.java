//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);

            int ans = new Solution().maxMeetings(n, start, end);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        int[][] meet = new int[n][3];
        for(int i=0;i<n;i++)
        {
            meet[i][0]=i;
            meet[i][1]=start[i];
            meet[i][2]=end[i];
        }
        Arrays.sort(meet,Comparator.comparingDouble(o->o[2]));
        int ans=1;
        int last=meet[0][2];
        for(int i=1;i<n;i++)
        {
            if(meet[i][1]>last)
            {
                ans++;
                last=meet[i][2];
            }
        }
        return ans;
    }
}
