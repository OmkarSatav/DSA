public class Staircase_Search {
    public static boolean isFound(int mtx[][], int key) {
        int row = mtx.length - 1, col = 0;
        while (row >= 0 || col <= mtx[0].length) {
            if (mtx[row][col] == key) {
                System.out.print("Key found at location (" + row + "," + col + ").");
                return true;
            } else if (key < mtx[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.print("Key not found");
        return false;
    }
    // Time Complexity - O(n+m)(where n = row length and m = column length)

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        isFound(arr, 14);
    }
}
