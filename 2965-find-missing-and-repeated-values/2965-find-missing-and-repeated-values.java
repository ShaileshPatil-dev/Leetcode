class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        // Find repeated and missing numbers
        for (int num = 1; num <= n * n; num++) {

            if (!map.containsKey(num)) {
                ans[1] = num;       // missing
            } 
            else if (map.get(num) == 2) {
                ans[0] = num;       // repeated
            }
        }

        return ans;
    }
}