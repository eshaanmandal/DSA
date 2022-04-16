package backtracking;
import java.util.*;

public class Queens {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public static void main(String[] args){
        int N = 10;
        int[][] grid = new int[N][N];
        placeQueen(grid, N, 0, new ArrayList<>());

        System.out.println(ans);
        System.out.println(ans.size());
    }

    public static void placeQueen(int[][] grid, int N, int row, ArrayList<Integer> path){
        if(row == N){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int j=0; j<N; j++){
            if(isSafe(grid, row, j, N)){
                grid[row][j] = 1;
                path.add(j);
                placeQueen(grid, N, row+1, path);
                path.remove(path.size()-1);
                grid[row][j] = 0;
            }
        }
    }
    public static boolean isSafe(int[][] grid, int row, int col, int N){
        for(int i=0; i<row; i++)
            if(grid[i][col] == 1)
                return false;

        for(int i=row, j=col; i>=0 && j>=0; i--,j--)
            if(grid[i][j]==1)
                return false;

        for(int i=row, j=col; i>=0 && j<N; i--, j++)
            if(grid[i][j] == 1)
                return false;

        return true;
    }
}
