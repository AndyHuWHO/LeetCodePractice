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

    public int uniquePaths (int m, int n) {
        //initialize the pathGrid that holds num of unique paths
        int[][] pathGrid = new int[m][n];

        // initialize base case for only 1 column
        for (int i = 0; i < m; i++) {
            pathGrid[i][0] = 1;
        }
        // initialze base case for only 1 row
        for (int j = 0; j < n; j++) {
            pathGrid[0][j] = 1;
        }
        // calculate the other grids 
        for (int i =1; i<m; i++) {
            for (int j=1; j<n; j++) {
                pathGrid[i][j] = pathGrid[i][j-1] + pathGrid[i-1][j];
            }
        }
        return pathGrid[m-1][n-1];
    }
    
}
