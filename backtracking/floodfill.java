package backtracking;
import java.util.*;
public class floodfill {
    static int N  = 8;
    static int M = 5;
    static int[] d_r = {-1, 0, 1, 0};
    static int[] d_c = {0, 1, 0, -1};
    static int new_val = 4;
    static int[][] grid = {
            {2, 3, 2, 1, 2},
            {3, 3, 3, 3, 1},
            {3, 1, 1, 3, 2},
            {1, 2, 2, 3, 3},
            {1, 3, 3, 3, 1},
            {2, 3, 2, 2, 2},
            {1, 2, 2, 1, 1},
            {3, 1, 1, 1, 2}
    };
    public static void main(String[] args){

        int r = 0, c = 1;
        int k = grid[r][c];
        grid[r][c] = new_val;
        backtrack(r, c, k);

        for(int[] i: grid){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void backtrack(int row, int col, int k){
        for(int i=0; i<4; i++){
            int n_row = row + d_r[i];
            int n_col = col + d_c[i];
//            System.out.println(n_row);
            if(isConnected(n_row, n_col, k)){
                grid[n_row][n_col] = new_val;
                backtrack(n_row, n_col, k);
            }
        }
    }

    public static boolean isConnected(int row, int col, int k){
        return row >= 0 && row < N && col >= 0 && col < M && grid[row][col] == k;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        solve(image,sr,sc,newColor);
        return image;
    }
    public void solve(int[][] image,int sr,int sc,int color){
        if(image[sr][sc]==color)return;
        int oldColor = image[sr][sc];
        if(sr!=0 && image[sr-1][sc]==oldColor)solve(image,sr-1,sc,color);
        if(sr!=image.length-1 && image[sr+1][sc]==oldColor)solve(image,sr+1,sc,color);
        if(sc!=0 && image[sr][sc-1]==oldColor)solve(image,sr,sc-1,color);
        if(sr!=image[0].length && image[sr][sc=1]==oldColor)solve(image,sr,sc+1,color);
    }
}
