class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if (backtrack(i,j,0,board,word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean backtrack(int r, int c,int wordIndex,char[][] board, String word) {
        if (r<0 || r>board.length-1 || c<0 || c>board[0].length-1 || board[r][c] != word.charAt(wordIndex)) {
            return false;
        }
        if (wordIndex == word.length()-1 ) {
            return true;
        }
        // Mark current cell as visited
        char temp = board[r][c];
        board[r][c] = '#';  // Use a placeholder to mark visited

        // Recurse in 4 directions
        boolean found = backtrack(r + 1, c, wordIndex + 1, board, word) ||  backtrack(r - 1, c, wordIndex + 1, board, word) ||    backtrack(r, c + 1, wordIndex + 1, board, word) ||    backtrack(r, c - 1, wordIndex + 1, board, word);

        // Backtrack: restore original value
        board[r][c] = temp;

        return found;
    }
}