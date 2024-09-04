public class Solution {

    public int uniquePathsRecurMemo (int m, int n) {
        int[][] memo = new int[m][n];
        return findAndMemoPaths (m, n, memo);
    }
    
    private int findAndMemoPaths (int m, int n, int[][] memo) {
        //base case, if there only 1 row or 1 column, there's only 1 path
        if (m==1|| n==1) {
            return 1;
        }
        // if the last gird is filled with value, return the value
        if (memo[m-1][n-1] != 0) {
            return memo[m-1][n-1];
        }

        // recursion, the last grid value should be the sum of num of unique paths of the two grids beside it
        memo[m-1][n-1]= findAndMemoPaths(m-1, n, memo) + findAndMemoPaths(m, n-1, memo);
        return memo[m-1][n-1];
    }
    
}
