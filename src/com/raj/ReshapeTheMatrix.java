class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        // Initialization
        int mat_rl = mat.length;
        int mat_cl = mat[0].length;

        // Return the original matrix if invalid row and column values provided.
        if (r * c != (mat_cl * mat_rl)) {
            return mat;
        }

        // Return the original matrix if the matrix RxC and provided R and C are same.
        if ((mat_cl == c) && (mat_rl == r)) {
            return mat;
        }

        // Initialization
        int[] temp = new int[r * c];
        int[][] ans = new int[r][c];

        // Store the matrix data into the one dimension temp array.
        for (int i = 0; i < mat_rl; i++) {
            for (int j = 0; j < mat_cl; j++) {
                temp[(((mat_cl) * i) + j)] = mat[i][j];
            }
        }

        // if the required array's r value is 1 then simply return the 1 dimension temp array.
        if (r == 1) {
            return new int[][]{temp};
        }

        // Store the temp array data into the required r and c format array.
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = temp[((i * c) + j)];
            }
        }

        return ans;
    }
}