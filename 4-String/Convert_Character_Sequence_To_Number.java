class Convert_Character_Sequence_To_Number 
{ 
    String printSequence(String S) 
    { 
        // code here
        String arr[] = {"2","22","222","3","33","333","4","44","444","5","55","555",
        "6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String output = "";
        for(int i=0; i < S.length(); i++){
            if(S.charAt(i) == ' ') output += "0";
            else{
                output += arr[S.charAt(i) - 'A'];
            }
        }
        
        return output;
        
    }
  
  public static void main(String args[]){
    String str = "MMCOE";
    System.out.println(printSequence(str));
  }
}
