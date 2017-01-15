import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ymoridza on 1/13/17.
 */
public class Board {
    private PrintStream printStream;
    private String[] boardSpots = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void designBoard(){
        printStream.println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

}
