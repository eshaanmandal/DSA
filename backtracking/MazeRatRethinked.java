package backtracking;
import java.util.*;
public class MazeRatRethinked {
    static int N = 4;
    static ArrayList<String> ans = new ArrayList<>();
    static int[] d_row = {1, 0, -1, 0};
    static int[] d_col = {0, 1, 0, -1};
    static String path = "DRUL";
    public static void main(String[] args){
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 0, 1}
        };

        maze[0][0] = 2;
        backtrack(maze, 0, 0, "");

        System.out.println(ans);

    }
    public static void backtrack(int[][] maze, int row, int col, String s){
        if(row == N-1 && col == N-1){
            ans.add(s);
            return;
        }
        for(int i=0; i<4;++i){
            int new_row = row + d_row[i];
            int new_col = col + d_col[i];
            if(isSafe(maze, new_row, new_col)){
                maze[new_row][new_col] = 2;
                backtrack(maze, new_row, new_col, s + path.charAt(i));
                maze[new_row][new_col] = 1;
            }

        }
    }
    public static boolean isSafe(int[][] maze, int row, int col){
        return row>=0 && row<N && col>=0 && col<N && maze[row][col] == 1;
    }
}
