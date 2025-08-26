class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max_diag_sq = 0;
        int max_area = 0;

        for (int[] dimension : dimensions) {
            int length = dimension[0];
            int width = dimension[1];
            int diag_sq = length * length + width * width;
            int area = length * width;

            if (diag_sq > max_diag_sq) {
                max_diag_sq = diag_sq;
                max_area = area;
            } else if (diag_sq == max_diag_sq) {
                if (area > max_area) {
                    max_area = area;
                }
            }
        }
        return max_area;
    }
}