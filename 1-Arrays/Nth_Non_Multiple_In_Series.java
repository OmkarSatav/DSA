import java.util.ArrayList;

public class Nth_Non_Multiple_In_Series {

    public static int getNthNonMultiple(int arr[], int b) {
        int n = 0;

        ArrayList<Integer> aL = new ArrayList<Integer>();

        int num = 1;
        while (aL.size() < b) {
            boolean check = true;
            for (int i = 0; i < arr.length; i++) {
                if (num % arr[i] != 0) {
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                aL.add(num);
            }
            num++;
        }

        return aL.get(b - 1);
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 2, 3, 5 };
        int b = 5;

        System.out.println(getNthNonMultiple(arr, b));
    }
}
