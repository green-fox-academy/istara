package matrixRotation;

public class MatrixRotation {

    private static int[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
    };

    private final static int N = 4;

    private static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print();

        for (int ring = 0; ring < N / 2; ring++) {
            int farthest = N - ring - 1;

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

        print();
    }
}