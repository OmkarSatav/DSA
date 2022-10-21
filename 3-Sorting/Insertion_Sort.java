public class Insertion_Sort {

    public static void insertionDescSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            while (j >= 0 && array[j + 1] < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
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

        insertionDescSort(arr);

        System.out.println("\nSorted Array : ");
        printArr(arr);

    }

}
