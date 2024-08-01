//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int start_row = 0;
        int start_col = 0;
        int end_row = mat.length - 1;
        int end_col = mat[0].length - 1;

        while (start_row <= end_row && start_col <= end_col) {
            // Top row
            for (int j = start_col; j <= end_col; j++) {
                ans.add(mat[start_row][j]);
            }
            start_row++;

            // Right column
            for (int i = start_row; i <= end_row; i++) {
                ans.add(mat[i][end_col]);
            }
            end_col--;

            // Bottom row
            if (start_row <= end_row) {
                for (int j = end_col; j >= start_col; j--) {
                    ans.add(mat[end_row][j]);
                }
                end_row--;
            }

            // Left column
            if (start_col <= end_col) {
                for (int i = end_row; i >= start_row; i--) {
                    ans.add(mat[i][start_col]);
                }
                start_col++;
            }
        }
        return ans;
    }
}
