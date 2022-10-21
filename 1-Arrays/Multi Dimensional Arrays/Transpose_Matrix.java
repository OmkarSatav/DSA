public class Transpose_Matrix {

    public static void printArr(int arr[][]) {
        for (int[] a : arr) {
            for (int data : a) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        System.out.println("Original Matrix :");
        printArr(arr);

        int newArr[][] = new int[4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }

        System.out.println("Transposed Matrix : ");
        printArr(newArr);

    }
}
