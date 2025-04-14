public class solutionpeak {

        public static int[] findPeakGrid(int[][] mat) {
            int n = mat.length; // number of rows
            int m = mat[0].length; // number of columns
            int left = 0;
            int right = m - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int maxIndex = 0;
    
                // Find the row with the max element in the current mid column
                for (int i = 1; i < n; i++) {
                    if (mat[i][mid] > mat[maxIndex][mid]) {
                        maxIndex = i;
                    }
                }
    
                // Binary search direction
                if (mid > 0 && mat[maxIndex][mid] < mat[maxIndex][mid - 1]) {
                    right = mid - 1;
                } else if (mid < m - 1 && mat[maxIndex][mid] < mat[maxIndex][mid + 1]) {
                    left = mid + 1;
                } else {
                    return new int[] { maxIndex, mid }; // Peak found
                }
            }
    
            return new int[] { -1, -1 }; // Not found (edge case)
        }
    
        public static void main(String[] args) {
            int[][] matrix = {
                {41, 8, 2, 48, 18},
                {16, 15, 9, 7, 44},
                {48, 35, 6, 38, 28},
                {3, 2, 14, 15, 33},
                {39, 36, 13, 46, 42}
            };
    
            int[] result = findPeakGrid(matrix);
            System.out.println("Peak Element at: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Peak Value: " + matrix[result[0]][result[1]]);
        }
    }
    
    
