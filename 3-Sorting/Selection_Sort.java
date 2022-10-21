public class Selection_Sort {

    // Selection Sort Method
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int pos = 0;
            boolean check = false;

            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                    check = true;
                }
            }

            // swap element
            if (check) {
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            } else {
                return;
            }

        }
    }

   // Printing element of an Array
    public static void printArr(int arr[]) {
        System.out.println("\nElements of array are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 8, 5, 6, 7 };

        printArr(arr);
      
        selectionSort(arr);

        System.out.println("\nSorted Array : ");
        printArr(arr);

    }

}
