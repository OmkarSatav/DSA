public class Backtracking_On_Array {

    public static void changeArray(int arr[], int i, int val) {
        if (i == arr.length) {
            printArr(arr);      // 1 2 3 4 5
            return;
        }
        arr[i] = val;
        changeArray(arr, i + 1, val + 1);
        arr[i] -= 2;  // -1 0 1 2 3
    }

    public static void printArr(int arr[]) {
        System.out.println("\nElements of array are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        changeArray(arr, 0, 1);

        printArr(arr);
    }
}


// Elements of array are:
// 1 2 3 4 5
// Elements of array are:
// -1 0 1 2 3
