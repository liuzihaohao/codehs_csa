public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private char board[][]={{'-','-','-'},{'-','-','-'},{'-','-','-'}};
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("  0 1 2");
       for(int i=0;i<3;i++){
           System.out.print(i+" ");
           for(int j=0;j<3;j++){
               System.out.print(board[i][j]+" ");
           }
           System.out.println();
       }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       if(board[row][col]!='X'&&board[row][col]!='O'){
           return true;
       }
       return false;
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if(turn%2==0){
           board[row][col]='X';
       }else{
           board[row][col]='O';
       }
       turn++;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       return (board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X')||(board[1][0]=='X'&&board[1][1]=='X'&&board[1][2]=='X')||(board[2][0]=='X'&&board[2][1]=='X'&&board[2][2]=='X')||(board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O')||(board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O')||(board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O');
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       return (board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X')||(board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X')||(board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X')||(board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O')||(board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O')||(board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O');
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       return (board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X')||(board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O')||(board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X')||(board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O');
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       return checkRow()||checkDiag()||checkCol();
   }

}