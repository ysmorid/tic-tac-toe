import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;

/**
 * Created by ymoridza on 1/13/17.
 */
public class Main {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        Board board = new Board(printStream);
        Player player = new Player(printStream);
        Game game = new Game(board, player);

        game.startGame();

    }
}
