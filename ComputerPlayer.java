//computer player derives from player

import java.util.Random;
public class ComputerPlayer extends Player
{
    

    public ComputerPlayer(int turn)
    {
        super(turn);
    }


    public void TakeTurn(Player othPlayer)
    {
        

        //check for win
        for (int i = 1; i < 10; i++)
        {
            
                //if current spot is null
            if (valid(i))
            {
                switch (i)
                {
                    case 1: board[0][0] = letter;
                            break;
                    case 2: board[0][1] = letter;
                            break;  
                    case 3: board[0][2] = letter;
                            break; 
                    case 4: board[1][0] = letter;
                            break; 
                    case 5: board[1][1] = letter;
                            break; 
                    case 6: board[1][2] = letter;
                            break;   
                    case 7: board[2][0] = letter;
                            break;   
                    case 8: board[2][1] = letter;
                            break;  
                    case 9: board[2][2] = letter;
                            break;        
                }
            
            
                //if it works return with that choice
                if (CheckWinner())
                {
                    System.out.println("Player " +GetTurn()+" (computer) chooses postion "+ (i));
                    return;
                }
                //else set the spot back to null and continue
                else {
                    switch (i)
                    {
                        case 1: board[0][0] = null;
                                break;
                        case 2: board[0][1] = null;
                                break;  
                        case 3: board[0][2] = null;
                                break; 
                        case 4: board[1][0] = null;
                                break; 
                        case 5: board[1][1] = null;
                                break; 
                        case 6: board[1][2] = null;
                                break;   
                        case 7: board[2][0] = null;
                                break;   
                        case 8: board[2][1] = null;
                                break;  
                        case 9: board[2][2] = null;
                                break;        
                    }
                }
                        
            }
        }
          
        

        //block winning play
        for (int i = 1; i < 10; i++)
        {
            
            
            //if current spot is null
                
            if (valid(i))
            {
                switch (i)
                {
                    case 1: board[0][0] = othPlayer.letter;
                            break;
                    case 2: board[0][1] = othPlayer.letter;
                            break;  
                    case 3: board[0][2] = othPlayer.letter;
                            break; 
                    case 4: board[1][0] = othPlayer.letter;
                            break; 
                    case 5: board[1][1] = othPlayer.letter;
                            break; 
                    case 6: board[1][2] = othPlayer.letter;
                            break;   
                    case 7: board[2][0] = othPlayer.letter;
                            break;   
                    case 8: board[2][1] = othPlayer.letter;
                            break;  
                    case 9: board[2][2] = othPlayer.letter;
                            break;        
                }                   

                //if it works block that move
                if (CheckWinner())
                {
                    System.out.println("Player " +GetTurn()+" (computer) chooses postion "+ (i+1));
                    switch (i)
                    {
                        case 1: board[0][0] = letter;
                                break;
                        case 2: board[0][1] = letter;
                                break;  
                        case 3: board[0][2] = letter;
                                break; 
                        case 4: board[1][0] = letter;
                                break; 
                        case 5: board[1][1] = letter;
                                break; 
                        case 6: board[1][2] = letter;
                                break;   
                        case 7: board[2][0] = letter;
                                break;   
                        case 8: board[2][1] = letter;
                                break;  
                        case 9: board[2][2] = letter;
                                break;        
                    } 
                    System.out.println("Player " +GetTurn()+" (computer) chooses postion "+ (i));                  
                    return;
                }
                //else set the spot back to null and continue
                else {
                    switch (i)
                    {
                        case 1: board[0][0] = null;
                                break;
                        case 2: board[0][1] = null;
                                break;  
                        case 3: board[0][2] = null;
                                break; 
                        case 4: board[1][0] = null;
                                break; 
                        case 5: board[1][1] = null;
                                break; 
                        case 6: board[1][2] = null;
                                break;   
                        case 7: board[2][0] = null;
                                break;   
                        case 8: board[2][1] = null;
                                break;  
                        case 9: board[2][2] = null;
                                break;        
                    }
                }
                    
            }
              
        }

        //take center square

        if (board[1][1] == null)
        {
            board[1][1] = letter;
            System.out.println("Player " +GetTurn()+" (computer) chooses postion 5");
            return;
        }

        //choose random
        Random rand = new Random();

        int choice = 0;
        //find a random spot that is not taken
        do{
            choice = rand.nextInt(9);
        } while (!valid(choice+1));

        switch (choice+1)
        {
            case 1: board[0][0] = letter;
                    break;
            case 2: board[0][1] = letter;
                    break;  
            case 3: board[0][2] = letter;
                    break; 
            case 4: board[1][0] = letter;
                    break; 
            case 5: board[1][1] = letter;
                    break; 
            case 6: board[1][2] = letter;
                    break;   
            case 7: board[2][0] = letter;
                    break;   
            case 8: board[2][1] = letter;
                    break;  
            case 9: board[2][2] = letter;
                    break;        
        }
        
        
        System.out.println("Player " +GetTurn()+" (computer) chooses postion "+ (choice+1));

    }




}
    

