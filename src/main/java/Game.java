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

    public void startGame() {
        board.displayBoard();
        player.displayMessage();
    }
}
