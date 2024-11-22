package dsa.strings;

import java.util.Stack;

public class ReverseWord {

    // this is nive method it require n aux space.
    static String reverseUsingStack(String str){

        Stack<String> wordStack = new Stack<>();

        String words[] = str.split(" ");

        for(String word : words){
            wordStack.push(word);
        }
        String res=" ";
        while (!wordStack.isEmpty()){
            res = res+wordStack.pop();
           //sb.append(" "+wordStack.pop());
         }
        return res;
    }

     static void reverse(char str[],int n){

       // starting point of word
        int start =0;
        for(int end=0;end<n;end++){
            if(str[end] ==' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);
     }

     static void reverse(char[] str, int low,int high){

        while (low<=high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }

     }


    public static void main(String args[]){
           String inputString = "welcome to Gfg";
           char[] str = inputString.toCharArray();
           int n = inputString.length();
         //  System.out.println(inputString);

       //  String str1=  reverseUsingStack(inputString);
       //  System.out.println(str1);
        reverse(str,n);
        System.out.println(str);
    //  String op=  reverseUsingStack(inputString);
    //    System.out.println(op);
    }
}
