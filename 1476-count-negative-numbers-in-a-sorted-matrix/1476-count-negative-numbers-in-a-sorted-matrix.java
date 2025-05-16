class Solution {
    public int countNegatives(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;
        int sum = 0;
        int i = m - 1;
        int j = 0;

     while (i >= 0 && j < n) {
       if (grid[i][j] < 0) {
         sum += n - j;
         i--;
        } else {
         j++;
        }
     }

    return sum;
    }
}