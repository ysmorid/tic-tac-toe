import org.junit.Test;

import java.io.PrintStream;
import java.lang.reflect.Array;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ymoridza on 1/13/17.
 */

public class BoardTest {

    @Test
    public void shouldDesignAndDisplayBoard(){
        PrintStream printStream = mock(PrintStream.class);
        Board board = new Board(printStream);

        board.displayBoard();

        verify(printStream).println("1 | 2 | 3");
        verify(printStream).println("4 | 5 | 6");
        verify(printStream).println("7 | 8 | 9");
    }

}
