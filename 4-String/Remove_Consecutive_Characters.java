public class Remove_Consecutive_Characters{


public String removeConsecutiveCharacter(String S){
    String str = "";
    int len = S.length();
    for(int i = 0; i< len; i++){
        if(i < len - 1 && S.charAt(i) == S.charAt(i+1)){
            continue;
        }else{
            str += S.charAt(i);
        }
    }
    
    return str;
}
 public static void main(String args[]){
   String str = "aabbcddd"; // abcd
   System.out.println(removeConsecutiveCharacters(str));
 } 
}  
  
