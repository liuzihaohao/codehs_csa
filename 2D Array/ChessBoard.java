class ChessBoard
{
    public static void main(String[] args)
    {
        //Initialize a new 2D array that is an 8x8 grid.
        String[][] chessBoard = new String[8][8];
        
        //This will cause an error, because each element in the 2D array must be an array.
        //Comment this out to get the program to work! 
        chessBoard[0] = "Rook";
        
        //This will work because this is accessing index 0 in the array stored in index 0 in the 2D array.
        chessBoard[0][0] = "Knight";
        printRow(chessBoard, 0);
        
        String[] pieces = {"Rook", "Knight", "Bishop", "King", "Queen", "Bishop", "Knight", "Rook"};
        //We can change all values in a row by setting it equal to String array
        chessBoard[0] = pieces;
        printRow(chessBoard, 0);
        
    }
    
    //This method prints out a given row in an array.
    //Don't worry about this, we will discuss how to create this method in the next lesson
    public static void printRow(String[][] array, int row)
    {
        System.out.println("Values for row " + row + ":");
        for(int index = 0; index<array[row].length; index++)
        {
            System.out.print(array[row][index] + " ");
        }
        System.out.println("\n");
    }
}