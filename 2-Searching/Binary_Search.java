public class Binary_Search {
  
    // using recusion
    public static int searchKeyIndx(int arr[], int si, int ei, int target) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return searchKeyIndx(arr, si, mid - 1, target);
            } else {
                return searchKeyIndx(arr, mid + 1, ei, target);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return searchKeyIndx(arr, mid + 1, ei, target);
            } else {
                return searchKeyIndx(arr, si, mid - 1, target);
            }
        }
    }

    public static int searchKey(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 7, 9, 11, 16, 17 };

        int pos = searchKey(arr, 7);
        if (pos == -1) {
            System.out.println("key not present in an array");
        } else {
            System.out.println("Key found at position : " + pos);
        }
        // System.out.println(searchKeyIndx(arr, 0, arr.length - 1, 0));
    }
}
