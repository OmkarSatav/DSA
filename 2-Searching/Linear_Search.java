public class Linear_Search {
    public static int linearSearch(int[] arr, int key) {
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 2, 6, 7, 16, 11, 14, 17 };
        int pos = linearSearch(arr, 7);
        if (pos == -1) {
            System.out.println("key not present in an array");
        } else {
            System.out.println("Key found at position : " + pos);
        }
    }
}
