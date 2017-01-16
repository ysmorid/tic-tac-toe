import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ymoridza on 1/13/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(System.out);
        List<String> boardSpots = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        });
        Board board = new Board(printStream, boardSpots, bufferedReader);
        Player player = new Player(printStream);
        Game game = new Game(board, player);

        game.playGame();

    }
}
