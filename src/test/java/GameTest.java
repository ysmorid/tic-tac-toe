import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ymoridza on 1/15/17.
 */
public class GameTest {
    Board board;
    PrintStream printStream;
    Game game;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = mock (Board.class);
        game = new Game(board, player);
    }

    @Test
    public void shouldDisplayBoardWhenGameIsStarted(){
        game.startGame();

        verify(board).displayBoard();
    }


}
