package dsa.strings;

public class Panagram {

     //LT 1832 easy
     static boolean isPanagram(String str){
      boolean fre[] = new boolean[26];

      int index =0;
      for(char ch : str.toCharArray()){
          if('A' <= ch && 'Z' >= ch) {
              index = ch - 'A';
          }else if ('a' <= ch && 'z' >= ch){
              index = ch -'a';
          }else {
              continue;
          }
          fre[index] = true;
      }

      for(boolean flag : fre){
           if(!flag)
               return false;

      }
     return true;
     }
    public static void main(String args[]){

         String str ="The quick brown fox jumps over the lay dog";
         System.out.println(isPanagram(str));

    }
}
