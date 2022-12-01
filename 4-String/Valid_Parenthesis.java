import java.util.*;

public class Valid_Palindrome {
  
    public boolean isValid(String s) {
       if(s.length() % 2 != 0) return false;
        
        Stack<Character> stk = new Stack();
        
        for(char c : s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                stk.push(c);
            }else if(c == ')' && !stk.isEmpty() && stk.peek() == '('){
                stk.pop();
            }else if(c == ']' && !stk.isEmpty() && stk.peek() == '['){
                stk.pop();
            }else if(c == '}' && !stk.isEmpty() && stk.peek() == '{'){
                stk.pop();
            }else{
                return false;
            }
        }
        
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[]()}";
        System.out.println("Is Valid Parenthesis : " + isValid(str));
    }
} 


