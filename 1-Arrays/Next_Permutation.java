class Next_Permutation {
    public void nextPermutation(int[] nums) {
        
        // Digit the break ascending order from right - 13541 - here digit 3.
        // Get Index of that digit
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        
       // swap the digit with next bigger digit in sequence towards right
        if(i>=0){
            int j = nums.length-1;
            while(j>=0 && nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        // Reverse the remaning part to arrange it in ascending order. 12541 -> 14125
        reverse(nums,i+1);
    }
    
    public static void swap(int a[], int st, int ed){
        int temp = a[st];
        a[st] = a[ed];
        a[ed] = temp;
    }
    
    public static void reverse(int a[], int start){
        int end = a.length-1;
        while(start < end){
            swap(a, start, end);
            start++;
            end--;
        }
    }
  
  public static void main(String args[]){
    int a[] = {1,2,5,4,2};
    nextPermutation(a);
  }
}

// Example of next permutation
//123 - 213
//13542 - 14235
