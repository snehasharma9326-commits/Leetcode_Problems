class Solution {

    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            //primary diagonal
            sum = sum + mat[i][i];

            //secondary diagonal without the middle element
            if (i != n - 1 - i) {
                sum = sum + mat[i][n - 1 - i];
            }
        }
        return sum;
    }
}