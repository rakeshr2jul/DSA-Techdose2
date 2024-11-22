package dsa.matrix;

public class SnakePattern {

    static int R=4,C=4;
    public static void main(String args[])
    {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        printSnake(arr);
    }

    static void printSnake(int mat[][]){
       for(int i =0;i<mat.length;i++){

           if(i%2 ==0 ) {
               for (int j = 0; j < mat[i].length; j++)
                   System.out.print(mat[i][j] + " ");
           }else {
               for (int j = C-1;j>=0;j--)
                   System.out.print(mat[i][j] + " ");
           }

       }

    }
}
