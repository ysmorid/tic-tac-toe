import java.io.IOException;

/**
 * Created by ymoridza on 1/15/17.
 */
public class Game {

    private Board board;
    private Player player;

    public Game(Board board, Player player) {
        this.board = board;
        this.player = player;
    }

    public void playGame() throws IOException {
        board.createsAndDisplaysBoard();
        player.displayMessage();
        board.replaceBoardSpotWithUserChoice();
    }
}
