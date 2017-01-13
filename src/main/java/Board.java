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

    public String designBoard(){
        String board = "";
        int counter = 0;
        while(counter < boardSpots.length) {
            for (int i = 0; i < 3; i++) {
                board += boardSpots[counter] + " | ";
                counter++;
            }
            board += "\n- - - - -\n";
        }
        return board;
    }

    public void displayBoard(){
        printStream.println(designBoard());
    }

}
