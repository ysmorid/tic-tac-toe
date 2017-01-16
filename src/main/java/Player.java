import java.io.PrintStream;

/**
 * Created by ymoridza on 1/15/17.
 */
public class Player {

    private PrintStream printStream;

    public Player(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayMessage() {
        printStream.println("Please enter a number from 1 - 9 to make your move:");
    }
}
