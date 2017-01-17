import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ymoridza on 1/15/17.
 */
public class Game {

    private PrintStream printStream;
    private Board board;
    private Player player;
    private int playerTurn = 1;

    public Game(Board board, Player player, PrintStream printStream) {
        this.board = board;
        this.player = player;
        this.printStream = printStream;
    }

    public void startGame() {
        board.createsAndDisplaysBoard();
    }

    public void playGame() throws IOException {
        player.displayMessage();
        if(!board.checkIfLocationTaken()){
            board.replaceBoardSpotWithUserChoice(playerTurn);
            playerTurn = player.switchPlayer(playerTurn);
        }
        else{
            playGame();
        }
    }

    public void playUntilBoardIsFilled() throws IOException {
        for(int NumberofMovesOnBoard = 0; NumberofMovesOnBoard < 9; NumberofMovesOnBoard++){
            playGame();
        }
        printStream.println("Game is a draw.");
    }
}
