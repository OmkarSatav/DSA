public class NQueens {

    public static void nQueensArrangement(String arr[][], int rows) {
        if (rows == arr.length) {
            printBoard(arr);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (isSafe(arr, rows, i)) {
                arr[rows][i] = "Q"; // Initially Q is set
                nQueensArrangement(arr, rows + 1);
                arr[rows][i] = "."; // Q is replaced with '.' after backtracking
            }
        }
    }

    public static boolean isSafe(String arr[][], int rows, int col) {
        // Checking vertically upward - Queen is present is not ?
        for (int i = rows - 1; i >= 0; i--) {
            if (arr[i][col] == "Q") {
                return false;
            }
        }

        // Checking diagonally left - Queen is present is not ?
        for (int i = col - 1, j = rows - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[j][i] == "Q") {
                return false;
            }
        }

        // Checking diagonally right - Queen is present is not ?
        for (int i = rows - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == "Q") {
                return false;
            }
        }
        
        // Or else you can print queen.
        return true;
    }

    public static void printBoard(String arr[][]) {
        System.out.println("\n---------------- Print Board ----------------- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        String board[][] = new String[4][4];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ".";
            }
        }

        nQueensArrangement(board, 0);
    }
}
