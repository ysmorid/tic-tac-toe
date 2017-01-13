import java.io.PrintStream;

/**
 * Created by ymoridza on 1/13/17.
 */
public class Board {
    private PrintStream printStream;

    public Board(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void designBoard(){
        printStream.println("1 | 2 | 3");
        printStream.println("- - - - -");
        printStream.println("4 | 5 | 6");
        printStream.println("- - - - -");
        printStream.println("7 | 8 | 9");
    }
}
