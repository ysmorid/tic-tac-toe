import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by ymoridza on 1/15/17.
 */
public class PlayerTest {
    PrintStream printStream;
    Board board;
    Player player;

    @Before
    public void setUp() throws Exception {
    printStream = mock(PrintStream.class);
    board = mock(Board.class);
    player = new Player(printStream);

    }

    @Test
    public void shouldDisplayMessageForPlayerToMakeAMove(){
        player.displayMessage();

        verify(printStream).println("Please enter a number from 1 - 9 to make your move:");
    }
}
