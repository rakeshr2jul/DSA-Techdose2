package dsa.strings;

import java.util.Stack;

public class ValidParenthesis {
        // 20. Valid Parentheses
    static boolean isValid(String str){
        Stack<Character>  st = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch =='(')
                st.push(')');
            else if(ch=='[')
                st.push(']');
            else if(ch== '{')
                st.push('}');
            else if(st.isEmpty() || st.pop() != ch)
                return false;
        }
         return  st.isEmpty();

    }
    public static void main(String args[]){
       System.out.println(isValid("{{(}}[]"));
    }
}
