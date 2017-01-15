/**
 * Created by ymoridza on 1/15/17.
 */
public class Game {

    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void startGame() {
        board.displayBoard();
    }
}
