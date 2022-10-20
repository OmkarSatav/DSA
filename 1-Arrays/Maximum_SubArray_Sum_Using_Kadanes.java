public class Maximum_SubArray_Sum_Using_Kadanes {
    public static void kadanesAlgo(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum Sum of Sub-array : " + ms);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanesAlgo(arr);
    }
}
