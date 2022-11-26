public class RotatedArray {
    public static int search(int arr[], int target) {
        // Find position of minimum element
        int min = searchMin(arr);

        // If target is in right half of Array
        if (arr[min] <= target && arr[arr.length - 1] >= target) {
            return searchTarget(arr, min, arr.length - 1, target);
        } else { // If target is in Left half of an Array
            return searchTarget(arr, 0, min - 1, target);
        }
    }

    // to find the position of minimium key in an Array
    public static int searchMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = left + (right - left) / 2;
        if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return mid;
        } else if (arr[left] <= arr[mid] && arr[mid] > arr[right]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }

        return left;
    }

    // use binary search function to search the target in sorted left or right part.
    public static int searchTarget(int arr[], int left, int right, int target) {
        int mid = left + (right - left) / 2;
        while (left < right) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 5));
    }
}
