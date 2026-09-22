public class Lab01_Ex6_6 {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 0, 3, 6},
            {18, 36, 4, 9},
            {3, 8, 9, 15},
            {7, 4, 2, 11}
        };

        int[][] matrixB = {
            {9, 8, 7, 3},
            {6, 5, 4, 18},
            {3, 36, 42, 9},
            {1, 0, 0, 1}
        };

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
