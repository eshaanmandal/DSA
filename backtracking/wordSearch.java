package backtracking;

public class wordSearch {
    static String found = "";
    static int N;
    static int M;
    static int[] d_r={0,1,-1,0};
    static int[] d_c={1,0,0,-1};
    public static void main(String[] args) {
        char[][] board = {
                {'a','b','s','e'},
                {'g','f','h','a'},
                {'f','g','x','a'},
                {'x', 'y', 'z','n'}
        };
        N = board.length;
        M = board[0].length;
        String word = "eshaan";
        System.out.println(searchGrid(board, word));
    }

    public static boolean searchGrid(char[][] board, String word){
        boolean answer=false;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(word.charAt(0) == board[i][j]){
                    answer = patternFind(board, i, j, 1, word);
                }
            }
        }
        return answer;
    }

    public static boolean patternFind(char[][] board, int r, int c, int count, String word){
        if(count == word.length()){
            return true;
        }

        for(int i=0; i<4; i++) {
            int n_r = r + d_r[i];
            int n_c = c + d_c[i];

            if(isValid(board, n_r, n_c, count, word)){
                if(patternFind(board, n_r, n_c, count+1, word)){
                    return true;
                }
            }
        }

     return false;
    }
     public static boolean isValid(char[][] board, int r, int c, int count, String word){
        return r>=0 && r<N && c>=0 && c<M && word.charAt(count)==board[r][c];
     }
}
