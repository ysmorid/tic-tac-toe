import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ymoridza on 1/13/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(System.out);
        List<String> boardSpots = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(printStream, boardSpots, bufferedReader);
        Player player = new Player(printStream);
        Game game = new Game(board, player, printStream);

        game.startGame();
        game.playUntilBoardIsFilled();

    }
}