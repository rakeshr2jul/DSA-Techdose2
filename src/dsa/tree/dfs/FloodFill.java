package dsa.tree.dfs;

public class FloodFill {

    // LT 733 https://www.youtube.com/watch?v=RwozX--B_Xs
    public static  int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(color == image[sr][sc])
            return image;

        int rows= image.length;
        int col = image[0].length;
        int source = image[sr][sc];
        dfs(image,sr,sc,color,rows,col,source);
        return image;
    }

    private static void dfs(int[][] image,int sr,int sc,int newcolor,int rows,int cols,int source){
         if(sr<0 || sr >= rows ||sc <0 || sc >=cols)
             return;
         else if(image[sr][sc] != source)
             return;
         image[sr][sc] = newcolor;
         dfs(image,sr-1,sc,newcolor,rows,cols,source); //top
         dfs(image,sr+1,sc,newcolor,rows,cols,source);//down
         dfs(image,sr,sc-1,newcolor,rows,cols,source);// left
         dfs(image,sr,sc+1,newcolor,rows,cols,source);//right;

    }

    public static void main(String args[]){

       int [][] image = {{1,1,1},{1,1,0},{1,0,1}};
       int  sr = 1, sc = 1, color = 2;

      int [][] nImage= floodFill(image,sr,sc,color);
      for(int i=0;i<nImage.length;i++) {
          for (int j = 0; j < nImage[i].length; j++) {
              System.out.print(nImage[i][j] + "\t");
          }
          System.out.println("");
      }
    }
}
