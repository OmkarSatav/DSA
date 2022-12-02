class Common_Elements_In_Arrays
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> arrListResult = new ArrayList<>();
        int i=0, j=0, k=0;
        
        while(i<n1 && j< n2 && k < n3){
            if(A[i] == B[j]  && B[j] == C[k]){
                
                if(!arrListResult.contains(A[i])){
                    arrListResult.add(A[i]);
                }
                i++;
                j++;
                k++;
                
            }else if(A[i] < B[j]){
                i++;
            }else if(B[j] < C[k]){
                j++;
            }else{
                k++;
            }
        }
        
        return arrListResult;
    }
}

// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80
