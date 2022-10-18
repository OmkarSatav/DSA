public class Maximum_and_Minimum_Element_in_an_Array {

    public static void findMaxAndMinEle(int[] arr) {
        int maxEle = Integer.MAX_VALUE;
        int minEle = Integer.MIN_VALUE;

        if (arr.length >= 1) {
            maxEle = arr[0];
            minEle = arr[0];
        } else {
            System.out.println("Array is emtpy");
        }

        for (int ele : arr) {
            if (maxEle < ele) {
                maxEle = ele;
            }

            if (minEle > ele) {
                minEle = ele;
            }
        }

        System.out.println("Maximum element of an array is : " + maxEle);
        System.out.println("Minimum element of an array is : " + minEle);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 10, 4, 17, 52, 2, 7 };
        findMaxAndMinEle(arr);
    }
}
