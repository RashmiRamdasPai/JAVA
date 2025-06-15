import java.util.*;
public class solvequeens {
    
    public static boolean isSafe(int row,int col,char[][]Board){
      for(int j=0;j<Board.length;j++){
        //checking horizontally
        if(Board[row][j] == 'Q'){
            return false;
        }
      }  
      //checking vrtically
      for(int j=0;j<Board[0].length;j++){
        if(Board[j][col] == 'Q'){
            return false;
        }
    }
    //upperleft
    int r = row;
    for(int c=col;c>=0 && r>=0;c--,r--){
        if(Board[r][c] == 'Q'){
            return false;
        }
    }
    //upper right
    r=row;
    for(int c=col;c<Board.length &&  r>=0;c++,r-- ){
         if(Board[r][c] == 'Q'){
            return false;
        }
    }
    //lower left
    r=row;
    for(int c=col;c>=0 && r<Board[0].length;c--,r++){
         if(Board[r][c] == 'Q'){
            return false;
        }
    }
    //lower right
    r=row;
    for(int c=col;c<Board.length && r<Board[0].length;c++,r++){
         if(Board[r][c] == 'Q'){
            return false;
        }
    }
    return true;

}
public static void saveBoard(char[][] board,List<List<String>> allBoards){
    String row = "";
    List<String> Board = new ArrayList<>();
    for(int i=0;i<board.length;i++){
        row = "";
        for(int j=0;j<board[0].length;j++){
            if(board[i][j] == 'Q'){
                row += 'Q';
            }
            else
            row += '.';
        }
        Board.add(row);
    }
    allBoards.add(Board);

}
public static void helper(char Board[][],List<List<String>> allBoards,int col ){
       if(col==Board.length){
                saveBoard(Board,allBoards);
                return;
            }
        for(int row=0;row<Board.length;row++){
            
           if(isSafe(row,col,Board)){
              Board[row][col]='Q';
              helper(Board,allBoards,col+1);
              Board[row][col]='.';
           }
        }
    }
    public static  List<List<String>> solveQueens(int n){
        List<List<String>> allBoards=new ArrayList<>();
        char Board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            Board[i][j] = '.';
        }
    }

    helper(Board, allBoards, 0);
return allBoards;
    }

public static void main(String args[]){
    int n = 4; 
List<List<String>> allBoards = new ArrayList<>(); 
allBoards = solveQueens(n); 
System.out.print(allBoards);
}}
