package dsa.strings;

public class LexiographicRankOfString {

    static int CHAR = 256;

    static int lexRank(String str){
         int res =1;
         int n = str.length();
         int mul = fact(n);
         int count [] = new int[CHAR];
         // count each character from given string
        for(int i=0;i<n;i++){
            count[str.charAt(i)]++;
        }
        // cumulative count , how many character less than current char
        for(int i =1;i<CHAR;i++){
            count[i] += count[i-1];
        }
        for(int i=0;i<n-1;i++){
            mul = mul / (n-1);
            res = res + count[str.charAt(i)-1]*mul;
            for(int j = str.charAt(i);j<CHAR;j++)
                count[j]--;
        }
        return res;
   }

    static int fact(int n){
            return (n <=1) ? 1 : n *fact(n-1);
    }

    public static void main(String args[]){
            System.out.println(lexRank("DCBA"));
    }
}
