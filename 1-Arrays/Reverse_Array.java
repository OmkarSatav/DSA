public class Reverse_Array {
    public static void reverseArray(int[] arr) {
        int len = arr.length;
        int mid = (len - 1) / 2;

        for (int i = 0; i <= mid; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };

        reverseArray(a);

        for (int num : a) {
            System.out.println(num);
        }
    }
}
