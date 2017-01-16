import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ymoridza on 1/15/17.
 */
public class GameTest {
    PrintStream printStream;
    Board board;
    Game game;
    Player player;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = mock (Board.class);
        player = mock(Player.class);
        game = new Game(board, player);
    }

    @Test
    public void shouldDisplayBoardWhenGameIsStarted() throws IOException {
        game.playGame();
        verify(board).createsAndDisplaysBoard();
    }

    @Test
    public void shouldDisplayMessageToPlayer1WhenGameIsStartedAfterBoardIsDisplayed() throws IOException {
        game.playGame();
        verify(player).displayMessage();
    }

}
