import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;
import java.lang.reflect.Array;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ymoridza on 1/13/17.
 */

public class BoardTest {
    PrintStream printStream;
    Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDesignAndDisplayBoard(){
        board.displayBoard();

        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldReplacePlayer1ChoiceOf3WithAnX(){

        board.replaceBoardSpotWithUserChoice();

        verify(printStream).println(
                "1|2|X\n" +
                 "-----\n" +
                 "4|5|6\n" +
                 "-----\n" +
                 "7|8|9");
    }
}
