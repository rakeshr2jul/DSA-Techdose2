package hashtable;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudoku(char [][] board) {

        /*for (int i=0;i<9;i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if(board[i][j] !='.' && !rowSet.add(board[i][j]))
                    return false;
                if(board[j][i] !='.' && !colSet.add(board[j][i]))
                    return false;

                int rowIndex = 3 * (i/3);
                int colIndex = 3 *(i%3);

              if(board[rowIndex+j/3][colIndex+j%3] !='.' && !cube.add(board[rowIndex+j/3][colIndex+j%3]))
                  return false;

            }
        }
        */

        HashSet<String> seen = new HashSet<>();

        for(int i =0;i<9 ;i++) {
            for (int j = 0; j < 9; j++) {

                if(board[i][j] !='.') {
                    char currentVal = board[i][j];
                   if((!seen.add(currentVal+" in row "+i)
                   ||!seen.add(currentVal+" in col"+j)
                   ||!seen.add(currentVal+" in box "+i/3+"-"+j/3)))
                    return false;
               }

            }
        }
        return true;

    }

    public static void main(String args[]){
      char  board[][] =
              {{'5','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
 ,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }
}
