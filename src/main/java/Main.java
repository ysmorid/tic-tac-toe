import java.io.PrintStream;

/**
 * Created by ymoridza on 1/13/17.
 */
public class Main {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        Board board = new Board(printStream);

        board.displayBoard();

    }
}
