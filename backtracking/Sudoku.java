package backtracking;

public class Sudoku {
    static int[][] grid = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
    };

    public static void main(String[] args){
        solver(1);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
    };

    public static void solver(int c) {
        if(c == 81)
            return;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                for(int num=1; num<10; num++){
                    if(isValid(i,j,num)){
                        grid[i][j] = num;
                        solver(c+1);
                        return;
                    }
                }
            }
        }



    }
    public static boolean isValid(int row, int col, int num){
        // check row and columns
        if(col > 8)
            return false;

        if(grid[row][col] != 0)
            return false;
        if(num > 9)
            return false;
        for(int i=0; i<9; i++)
            if(grid[i][col] == num)
                return false;
        for(int j=0; j<9; j++)
            if(grid[row][j] == num)
                return false;
        int row_start, row_end, col_start, col_end;
        if(row % 3 == row) {
            row_start = 0;
            row_end = 3;
        }
        else if(row % 6 == row) {
            row_start = 3;
            row_end = 6;
        }
        else {
            row_start = 6;
            row_end = 9;
        }

        if(col % 3 == col) {
            col_start = 0;
            col_end = 3;
        }
        else if(col % 6 == row) {
            col_start = 3;
            col_end = 6;
        }
        else {
            col_start = 6;
            col_end = 9;
        }

        for(int i=row_start; i<row_end; i++){
            for(int j=col_start; j<col_end;j++){
                if(grid[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
