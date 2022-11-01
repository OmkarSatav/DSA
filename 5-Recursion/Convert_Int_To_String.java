public class Convert_Int_To_String{ 
  
  
  public static StringBuilder ConvertIntToString(int num, StringBuilder str) {
        String nums[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        if (num == 0) {
            return str;
        }

        int n = num % 10;
        String newDigit = nums[n];

        ConvertIntToString(num / 10, str);
        return str.append(newDigit + " ");
 }
  
  
  public static void main(String args[]){
     System.out.println(ConvertIntToString(1973,new StringBuilder(""));
  }
}
