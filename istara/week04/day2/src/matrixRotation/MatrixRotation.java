package matrixRotation;

public class MatrixRotation {

    private static int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
    };

    private final static int n = 3;

    private static void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printMatrix();

        for (int ring = 0; ring < n / 2; ring++) {
            int farthest = n - ring - 1;

            for (int i = ring; i < farthest; i++) {
                int temp = matrix[ring][i];
                matrix[ring][i] = matrix[farthest - i + ring][ring];
                matrix[farthest - i + ring][ring] =
                        matrix[farthest][farthest - i + ring];
                matrix[farthest][farthest - i + ring] =
                        matrix[i][farthest];
                matrix[i][farthest] = temp;
            }
        }
        printMatrix();
    }
}