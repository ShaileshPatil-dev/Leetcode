
    class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int[][] rot = new int[mat.length][mat.length];

        for (int k = 0; k <= 3; k++) {

            boolean flag = true;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (mat[i][j] != target[i][j]) {
                        flag = false;
                    }
                }
            }

            if (flag) {
                return true;
            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    rot[j][mat.length - i - 1] = mat[i][j];
                }
            }

            mat = rot;
            rot = new int[mat.length][mat.length];
        }

        return false;
    }
}