public class Bubble_Sort {
  
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void printArr(int arr[]) {
        System.out.println("\nElements of array are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 8, 5, 6, 7 };

        printArr(arr);

        bubbleSort(arr);

        System.out.println("\nSorted Array : ");
        printArr(arr);
    }

}
