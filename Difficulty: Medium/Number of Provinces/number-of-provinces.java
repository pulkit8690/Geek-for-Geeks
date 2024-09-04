//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        ArrayList<ArrayList<Integer>> adjls = new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adjls.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                if(adj.get(i).get(j)==1 & i!=j)
                {
                    adjls.get(i).add(j);
                    adjls.get(j).add(i);
                }
            }
        }
        int count=0;
        int visited[]= new int[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                count++;
                dfs(i,adjls,visited);
            }
        }
        return count;
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,int visited[])
    {
        visited[node]=1;
        for(Integer i : adj.get(node))
        {
            if(visited[i]!=1)
            {
                dfs(i,adj,visited);
            }
        }
    }
};