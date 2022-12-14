public class Counting_Sort {

    public static void countingSort(int arr[]) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr) {
            if (maxNum < num) {
                maxNum = num;
            }
        }

        int arrCount[] = new int[maxNum + 1];
        for (int i = 0; i < arr.length; i++) {
            arrCount[arr[i]]++;
        }

        int newArr[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arrCount.length; i++) {
            while (arrCount[i] > 0) {
                newArr[j] = i;
                --arrCount[i];
                j++;
            }
        }
        printArr(newArr);
    }

    public static void printArr(int arr[]) {
        System.out.println("\nElements of array are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    
    // Sorts characters in a String
    public static String countSort(String arr)
    {
        // code here
        int temp[] = new int[26];
        String result = "";
        for(char ch: arr.toCharArray()){
            temp[ch - 97]++;
        }
        
        for(int i=0; i < temp.length ;i++){
            if(temp[i] > 0){
                int j = i;
                while(temp[j] > 0){
                    result += (char)(97+i);
                    temp[j]--;
                }
            }
        }
        return result;
        
    }
    
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 8, 5, 6, 7 };

        printArr(arr);
      
        countingSort(arr);
      
        System.out.println("\nSorted Array : ");
        printArr(arr);

    }

}
