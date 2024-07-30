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
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        int n = mat.length;
        ArrayList<String> ans = new ArrayList<>();
        if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) {
            return ans; 
        }
        int[][] visited = new int[n][n];
        visited[0][0] = 1;
        move(mat, 0, 0, n, "", visited, ans);
        return ans;
    }

    public void move(int[][] mat, int i, int j, int n, String s, int[][] visited, ArrayList<String> ans) {
        if (i == n - 1 && j == n - 1) {
            ans.add(s);
            return;
        }
        
        // Downward
        if (i + 1 < n && mat[i + 1][j] == 1 && visited[i + 1][j] == 0) {
            visited[i + 1][j] = 1;
            move(mat, i + 1, j, n, s + 'D', visited, ans);
            visited[i + 1][j] = 0;
        }
        // Upward
        if (i - 1 >= 0 && mat[i - 1][j] == 1 && visited[i - 1][j] == 0) {
            visited[i - 1][j] = 1;
            move(mat, i - 1, j, n, s + 'U', visited, ans);
            visited[i - 1][j] = 0;
        }
        // Left
        if (j - 1 >= 0 && mat[i][j - 1] == 1 && visited[i][j - 1] == 0) {
            visited[i][j - 1] = 1;
            move(mat, i, j - 1, n, s + 'L', visited, ans);
            visited[i][j - 1] = 0;
        }
        // Right
        if (j + 1 < n && mat[i][j + 1] == 1 && visited[i][j + 1] == 0) {
            visited[i][j + 1] = 1;
            move(mat, i, j + 1, n, s + 'R', visited, ans);
            visited[i][j + 1] = 0;
        }
    }
}