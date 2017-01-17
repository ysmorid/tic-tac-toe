import java.io.IOException;

/**
 * Created by ymoridza on 1/15/17.
 */
public class Game {

    private Board board;
    private Player player;
    private int playerTurn = 1;

    public Game(Board board, Player player) {
        this.board = board;
        this.player = player;
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
    }

    public void playUntilBothPlayersHavePlayedTheirTurns() throws IOException {
        playGame();
        playGame();
    }
}
