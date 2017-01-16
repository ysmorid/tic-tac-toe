import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ymoridza on 1/13/17.
 */

public class BoardTest {
    PrintStream printStream;
    Board board;
    private List<String> boardSpots;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        boardSpots = mock(ArrayList.class);
        board = new Board(printStream, boardSpots, bufferedReader);
    }

    @Test
    public void shouldDesignAndDisplayBoard(){
        board.createsAndDisplaysBoard();

        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldReplacePlayer1ChoiceOf3WithAnX() throws IOException {
        when(bufferedReader.readLine()).thenReturn("3");
        board.replaceBoardSpotWithUserChoice();

        verify(printStream).println(
                "1|2|X\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldReplacePlayer1ChoiceOf6WithAnX() throws IOException {
        when(bufferedReader.readLine()).thenReturn("6");
        board.replaceBoardSpotWithUserChoice();

        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|X\n" +
                "-----\n" +
                "7|8|9");
    }
}
