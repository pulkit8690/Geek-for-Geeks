//{ Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}


// } Driver Code Ends


class Solution {
    public static int activitySelection(int start[], int end[], int n) 
    {
        // add your code here
        int count=1, arr[][]= new int[n][2];
        
        for(int x=0;x<n;x++)
        {
            arr[x][0]=start[x];
            arr[x][1]=end[x];
        }
        
        Arrays.sort(arr, (a,b)-> {
            return a[1]-b[1];
            
        });
        
        int time=arr[0][1];
        
        for(int x=1;x<n;x++ )
        {
            if(arr[x][0]>time)
            {
                time=arr[x][1];
                count++;
            }
        }
        
        return count;
        
        
    }
}