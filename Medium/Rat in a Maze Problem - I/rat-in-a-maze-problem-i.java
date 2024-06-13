//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        int visited[][] = new int[n][n];
        ArrayList<String> paths = new ArrayList<>();
        if (m[0][0] == 1) { // Check if starting point is 1
            move(m, 0, 0, n, "", visited, paths);
        }
        return paths;
    }

    private static void move(int[][] path, int i, int j, int n, String ans, int visited[][], ArrayList<String> paths) {
        if (i == n - 1 && j == n - 1) 
        {
            paths.add(ans);
            return;
        }
        visited[i][j] = 1;

        // Downwards
        if (i + 1 < n && visited[i + 1][j] == 0 && path[i + 1][j] == 1) {
            move(path, i + 1, j, n, ans + 'D', visited, paths);
        }
        // Upwards
        if (i - 1 >= 0 && visited[i - 1][j] == 0 && path[i - 1][j] == 1) {
            move(path, i - 1, j, n, ans + 'U', visited, paths);
        }
        // Right
        if (j + 1 < n && visited[i][j + 1] == 0 && path[i][j + 1] == 1) {
            move(path, i, j + 1, n, ans + 'R', visited, paths);
        }
        // Left
        if (j - 1 >= 0 && visited[i][j - 1] == 0 && path[i][j - 1] == 1) {
            move(path, i, j - 1, n, ans + 'L', visited, paths);
        }

        visited[i][j] = 0;
    }
}    