public class Diagonal_Sum {
    public static void diagonalSum(int mtx[][]) {
        int primaryDiagonalTotal = 0;
        int secondaryDiagonalTotal = 0;
        for (int i = 0; i < mtx.length; i++) {

            primaryDiagonalTotal += mtx[i][i];

            if (i != mtx.length - 1 - i) {// If i != j, Valid in Matrix with odd number of rows. To avoid double consideration of middle cell.
                secondaryDiagonalTotal += mtx[i][mtx.length - i - 1];
            }
        }
        System.out.println(
                "Sum of Primary and Secondary Diagonal are " + primaryDiagonalTotal + " and " + secondaryDiagonalTotal);
    }

    public static void main(String[] args) {
        int mtx[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        diagonalSum(mtx);
    }
}
