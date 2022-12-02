class Searching_Element_Differ_By_K{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
      
       // k is atmost difference in consecutive elements.
      
       int i = 0;
       while(i < n){
           if(arr[i] == x) return i;
           int steps = Math.abs(arr[i] - x)/k; // Taking Steps 
           i += Math.max(1,steps); 
       }
       return -1;
}
  
// Input : arr[ ] = {4, 5, 6, 7, 6}, K = 1 and X = 6
// Output : 2
  
// Input : arr[ ] = {20 40 50}, K = 20 and X = 70
// Output :  -1 
  
// Refer video
  https://youtu.be/s_IYrsRhxtw
