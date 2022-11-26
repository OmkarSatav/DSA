public class QuickSort{
    // Quick Sort
    public static void quickSort(int arr[], int si, int ei) {
        if (si < ei) {
            int pidx = partition(arr, si, ei); // Returns index of pivot
            quickSort(arr, si, pidx - 1); // left half of pivot element
            quickSort(arr, pidx + 1, ei); // right half of pivot element
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int i = si - 1;
        int pivot = arr[ei];

        for (int j = si; j < ei; j++) { // n-1 because last element is pivot
            if (pivot > arr[j]) { // swap the smaller elements than pivot with initial positions(left half)
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++; // To bring pivot to appropriate position
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void printArr(int arr[]) {
        System.out.println("\nElements of array are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
 
  public static void main(String args[]){
   int arr[] = { 1, 2, 4, 3, 8, 5, 6, 7 };

        printArr(arr);

        // Quick Sort
        quickSort(arr, 0, 7);
    
        printArr(arr);

  }
}  
