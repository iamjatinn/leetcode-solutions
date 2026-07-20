class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        int q = k / n;
        int r = k % n;
        q %= m;
        
        int[][] ans = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            int i1 = i + q + 1;
            for (int j = 0; j < n; j++) {
                boolean minus1 = (j + r < n);
                int j0 = j + r;
                j0 -= (j0 >= n) ? n : 0;
                
                int i0 = i1 - (minus1 ? 1 : 0);
                i0 -= (i0 >= m) ? m : 0;
                
                ans[i0][j0] = grid[i][j];
            }
        }

        // Fixed return type conversion
        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : ans) {
            List<Integer> listRow = new ArrayList<>();
            for (int val : row) {
                listRow.add(val);
            }
            result.add(listRow);
        }
        
        return result;
    }
}