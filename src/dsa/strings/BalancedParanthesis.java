package dsa.strings;

import java.util.Stack;

public class BalancedParanthesis {
   // Leetcode 20 : easy
    static boolean matching(char a ,char b){
        return ((a=='(' && b==')') || (a=='[' && b==']')||(a == '{' && b =='}'));
    }
    static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<str.length();i++){

            char x= str.charAt(i);
            if (x == '(' || x == '{' || x =='[') {
                stack.push(x);
            }else {
                if(stack.isEmpty()==true)
                    return false;
                else if(matching(stack.peek(),str.charAt(i))==false)
                    return false;
                else
                    stack.pop();

            }
        }
       return (stack.isEmpty()==true);
    }

    public static boolean isValid(String s) {
        Stack<Character>  st = new Stack<>();
        for(char ch : s.toCharArray()){
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

        System.out.println(isValid("{{}}[]("));
    }
}
