import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    public void shouldDisplayBoardWhenGameIsStarted(){
        game.startGame();
        verify(board).displayBoard();
    }

    @Test
    public void shouldDisplayMessageToPlayer1WhenGameIsStartedAfterBoardIsDisplayed(){
        game.startGame();
        verify(player).displayMessage();
    }

}
