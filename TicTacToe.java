import java.lang.Integer;
import java.lang.String;

//main class for the game
public class TicTacToe {
    // main method
    public static void main(String[] args) {

        boolean win = false;
        int winner = 0;
        // create array of the players
        Player[] players = new Player[2];

        // if there are arguments then check the arguments
        if (args.length > 0) {
            // if only argument is -c create two computer players
            if (args.length == 1) {
                players[0] = new ComputerPlayer(1);
                players[1] = new ComputerPlayer(2);
            }

            // if two args check both
            else if (args.length == 2) {
                // make computer player first
                if (Integer.parseInt(args[1]) == 1) {
                    players[0] = new ComputerPlayer(1);
                    players[1] = new HumanPlayer(2);
                }
                // make human player first
                else if (Integer.parseInt(args[1]) == 2) {
                    players[0] = new HumanPlayer(1);
                    players[1] = new ComputerPlayer(2);
                }
                // print usage message because args are incorrect
                else {
                    System.out.println("Usage:  java TicTacToe [-c [1|2]]");
                }

            }
            // if arg length is wrong then print usage method
            else {
                System.out.println("Usage:  java TicTacToe [-c [1|2]]");
            }

        }
        // no args then create two human players
        else {
            players[0] = new HumanPlayer(1);
            players[1] = new HumanPlayer(2);
        }
        int i = 0;
        int count = 0;
        do {
            players[i].DrawGame();
            DrawExampleBoard();

            if (i == 0) {
                players[i].TakeTurn(players[i + 1]);

                win = players[i].CheckWinner();
                if (win == true) {
                    winner = players[i].GetTurn();
                }
                i++;
            } else if (i == 1) {
                players[i].TakeTurn(players[i - 1]);

                win = players[i].CheckWinner();
                if (win == true) {
                    winner = players[i].GetTurn();
                }
                i--;
            }
            count++;

        } while ((win == false) && (count < 9));

        players[0].DrawGame();

        if (win == true)
            System.out.println("Player " + winner + " wins!");
        else
            System.out.println("It is a draw!");

    }

    // helper function for drawing he example board
    private static void DrawExampleBoard() {
        System.out.println("Positions:\n");
        for (int i = 0; i < 9; i = i + 3) {
            System.out.println(" " + (i + 1) + " | " + (i + 2) + " | " + (i + 3));
            if (i < 6)
                System.out.println("-----------");
        }

    }
}