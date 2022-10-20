
import java.util.*;
import java.io.*;

public class Contains_Duplicate_Element {

    // Time Complexity - O(n^2)
    public static boolean distinctEle(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Time Complexity - O(n)
    public static boolean containsDuplicateElement(int arr[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (al.contains(arr[i])) {
                System.out.println("Contains duplicate elements");
                return true;
            } else {
                al.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };

        System.out.println(containsDuplicateElement(arr));
    }
}
