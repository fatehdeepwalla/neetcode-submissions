class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!rowCheck(i, board)) return false;
            if(!columnCheck(i, board)) return false;
            if(!subgridCheck(i, board)) return false;
        }    
        return true;
    }

    public boolean rowCheck(int row, char[][] board){
        HashSet<Character> temp=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[row][i]!='.') {
                if(!temp.add(board[row][i])) return false;
            }
        }
        return true;
    }

    public boolean columnCheck(int column, char[][] board){
        HashSet<Character> temp=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[i][column]!='.') {
                if(!temp.add(board[i][column])) return false;
            }
        }
        return true;
    }

    public boolean subgridCheck(int number, char[][] board){
        HashSet<Character> temp=new HashSet<>();
        int row=3*(number/3);
        int column=3*(number%3);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[row+i][column+j]!='.') {
                    if(!temp.add(board[row+i][column+j])) return false;
                }
            }
        }
        return true;
    }
}
