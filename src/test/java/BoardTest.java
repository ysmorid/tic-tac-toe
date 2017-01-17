import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by ymoridza on 1/13/17.
 */

public class BoardTest {
    PrintStream printStream;
    Board board;
    private List<String> boardSpots;
    private BufferedReader bufferedReader;
    private int userSelection;

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
        userSelection = 3;
        board.replaceBoardSpotWithUserChoice(1);

        verify(printStream).println(
                "1|2|X\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldReplacePlayer2ChoiceOf6WithAnO() throws IOException {
        when(bufferedReader.readLine()).thenReturn("6");
        board.replaceBoardSpotWithUserChoice(2);

        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|O\n" +
                "-----\n" +
                "7|8|9");
    }
}
