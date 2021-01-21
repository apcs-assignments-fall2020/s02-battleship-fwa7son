import javax.lang.model.util.ElementScanner6;

public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        boolean succHit = false;
        if(board[row][col] == true)
        {
            succHit = true;
        }
        return succHit;
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if(direction ==("right"))
        {
            for(int i = col; i<col+boatLength; i++)
            {
                board[row][i] = true;
            }
        }
        else if(direction == "down")
        {
            for(int i = row; i<row+boatLength; i++)
            {
                board[i][col] = true;
            }
        }
        else
        {
            return null;
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        boolean inOrderStat = false;
        for(int i = 0; i<words.length;i++)
        {
            for(int j = 0; j<words[0].length-1;j++)
            {
                String string = words[i][j];
                String secondstring = words[i][j+1];
                char character = string.charAt(0);
                char secondcharacter = secondstring.charAt(0);

                int variable1 = string.length();
                int variable2 = secondstring.length();

                if(variable1>variable2 || character>secondcharacter)
                {
                    inOrderStat = false;
                }
                else
                {
                    inOrderStat = true;
                }
            }
        }
        return inOrderStat;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
