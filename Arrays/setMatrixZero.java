package Arrays;
import java.util.*;

public class setMatrixZero {
    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(rows.contains(i)){
                    if(matrix[i][j] == 0){
                        cols.add(j);
                    }
                }
                if(cols.contains(j)){
                    if(matrix[i][j] == 0){
                        rows.add(i);
                    }
                }
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        System.out.println(rows);
        System.out.println(cols);

        for(int i:rows){
            Arrays.fill(matrix[i], 0);
        }

        for(int j:cols){
            for(int i=0; i<matrix.length; i++){
                matrix[i][j] = 0;
            }
        }

        System.out.println(matrix);

    }
    public static void main(String[] args){
            int[][] matrix = {
                    {0,1,2,0},{3,4,5,2},{1,3,1,5}
            };

            setZeroes(matrix);
    }
}
