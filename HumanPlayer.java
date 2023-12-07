import java.util.Scanner;

//Human player derives from player
public class HumanPlayer extends Player {

        public HumanPlayer(int turn) {
                super(turn);
        }

        public void TakeTurn(Player othPlayer) {
                int choice;
                Scanner in = new Scanner(System.in);
                do {
                        System.out.print("Player " + GetTurn() + " please enter a move (1-9): ");
                        choice = in.nextInt();
                        if (choice < 1 || choice > 9)
                                System.out.println("Invalid choice. Please enter 1-9");
                        else if (!valid(choice)) {
                                System.out.println("Invalid choice. Please enter a different choice");
                        } else {
                                switch (choice) {
                                        case 1:
                                                board[0][0] = letter;
                                                break;
                                        case 2:
                                                board[0][1] = letter;
                                                break;
                                        case 3:
                                                board[0][2] = letter;
                                                break;
                                        case 4:
                                                board[1][0] = letter;
                                                break;
                                        case 5:
                                                board[1][1] = letter;
                                                break;
                                        case 6:
                                                board[1][2] = letter;
                                                break;
                                        case 7:
                                                board[2][0] = letter;
                                                break;
                                        case 8:
                                                board[2][1] = letter;
                                                break;
                                        case 9:
                                                board[2][2] = letter;
                                                break;
                                }
                                break;
                        }

                } while ((choice < 1 || choice > 9) || (!valid(choice)));
                in.close();
        }

}