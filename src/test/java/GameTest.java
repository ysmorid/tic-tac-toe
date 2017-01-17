import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by ymoridza on 1/15/17.
 */
public class GameTest {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;
    private Game game;
    private Player player;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player = mock(Player.class);
        game = new Game(board, player);
    }

    @Test
    public void shouldDisplayBoardWhenGameIsStarted() throws IOException {
        game.startGame();
        verify(board).createsAndDisplaysBoard();
    }

    @Test
    public void shouldEnsureThatBothPlayersMovedOnce() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2").thenReturn("4");

        game.playUntilBothPlayersHavePlayedTheirTurns();

        verify(player, times(2)).displayMessage();
    }

    @Test
    public void shouldReturnMessageIfLocationOnBoardAlreadyTaken() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2").thenReturn("2");

        game.playUntilBothPlayersHavePlayedTheirTurns();

        verify(printStream).println("Location already taken. Please choose again.");
    }

}