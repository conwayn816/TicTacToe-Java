//Player class 
//abstract because it will not be instantiated


public abstract class Player 
{
    protected int turnNumber;
    protected String letter;

    protected static String[][] board = new String[3][3];

    public Player(int turn)
    {
        turnNumber = turn;
        if (turnNumber == 1)
            letter = "X";
        else
            letter = "O";
    }

    //function that returns the turn number of the person going
    public int GetTurn()
    {
        return turnNumber;
    }


    public abstract void TakeTurn(Player othPlayer);


    //draws the game board
    public void DrawGame()
    {

        System.out.println("Current Game Board:\n");
        for (int i = 0; i < 3 ; i++)
        {
            System.out.println(" "+board[i][0]+" | "+board[i][1]+" | "+board[i][2]);
            if (i < 2)
                System.out.println("-----------");
            
        }
    }


    public boolean CheckWinner()
    {

        //for loop to check all win conditions
        for (int i = 0; i < 8; i++) {
            String line = null;
  
            switch (i) {
            //first 3 check rows
            case 0:
                line = board[0][0] + board[0][1] + board[0][2];
                break;
            case 1:
                line = board[1][0] + board[1][1] + board[1][2];
                break;
            case 2:
                line = board[2][0] + board[2][1] + board[2][2];
                break;
            //next 3 check column 
            case 3:
                line = board[0][0] + board[1][0] + board[2][0];
                break;
            case 4:
                line = board[0][1] + board[1][1] + board[2][1];
                break;
            case 5:
                line = board[0][2] + board[1][2] + board[2][2];
                break;
            //check diagonals
            case 6:
                line = board[0][0] + board[1][1] + board[2][2];
                break;
            case 7:
                line = board[0][2] + board[1][1] + board[2][0];
                break;
            }
            
            //if line meets X win condition return true
            if (line.equals("XXX")) {
                return true;
            }
              
            // same for OOO
            else if (line.equals("OOO")) {
                return true;
            }
        }
        //if no winning condition met then return false
        return false;
    }
    
    protected boolean valid(int choice)
    {
        boolean val = false;
        switch (choice)
        {
        case 1: val =(board[0][0] == null);
                break;
        case 2: val = (board[0][1] == null);              
                break;
        case 3: val = (board[0][2] == null);
                break;
        case 4: val = (board[1][0] == null);
                break;
        case 5: val = (board[1][1] == null);
                break; 
        case 6: val = (board[1][2] == null);
                break;   
        case 7: val = (board[2][0] == null);
                break;   
        case 8: val = (board[2][1] == null);
                break;  
        case 9: val = (board[2][2] == null);
                break;  
        default: val = false;
                break;      
        }  
        
        return val;
    }

    
}


