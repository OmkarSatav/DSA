public class Maximum_in_SubArray{

static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        int i=0;
        ArrayList<Integer> arrLL = new ArrayList<Integer>();
        // Your code here
        if(arr.length >= k){
            
            while(i+k-1 < arr.length){
                int max = arr[i];
                for(int j=i; j<=i+k-1;j++){
                    if(max < arr[j])
                        max = arr[j];
                }
                arrLL.add(max);
                i++;
            }
        }
        return arrLL;
    }
    
    public static void main(String args[]){
      
    }
}
