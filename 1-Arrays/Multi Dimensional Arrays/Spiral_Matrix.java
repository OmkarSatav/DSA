public class Spiral_Matrix {
    public static void spiralDisplay(int arr[][]) {
        int startCol = 0;
        int endCol = arr[0].length - 1;
        int startRow = 0;
        int endRow = arr.length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[startRow][i]);
            }

            // right
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endCol]);
            }

            // bottom
            for (int k = endCol - 1; k >= startCol; k--) {
                if (startRow == endRow) {
                    return;
                }
                System.out.print(arr[endRow][k]);
            }

            // left
            for (int m = startRow + 1; m <= endRow - 1; m++) {
                if (startCol == endCol) {
                    return;
                }
                System.out.print(arr[m][startRow]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        spiralDisplay(arr);
    }
}
