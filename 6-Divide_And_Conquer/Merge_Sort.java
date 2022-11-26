
public class MergeSort{
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // Right part
        merge(arr, si, mid, ei); // Sorts and merges sub-arrays.
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        // Comparing elements from left and right halfs
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // If only left half is remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // If only right half is remainig
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copying the element to original array.
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
 
  public static void main(String args[]){
   int arr[] = { 1, 2, 4, 3, 8, 5, 6, 7 };

        printArr(arr);

        // Merge Sort.
        mergeSort(arr, 0, 6);
    
        printArr(arr);

  }
}  
