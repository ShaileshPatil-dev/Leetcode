class Solution {
    public int[] findDegrees(int[][] matrix) {
        int size = matrix.length;
        int[] ans = new int[size];

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0; j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    ans[j]++;
                }
            }
        }
        return ans;
    }
}