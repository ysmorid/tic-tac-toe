import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ymoridza on 1/13/17.
 */
public class Board {
    private PrintStream printStream;
    private List<String> boardRows = new ArrayList();
    private String row1 = "1 | 2 | 3";
    private String row2 = "- - - - -";
    private String row3 = "4 | 5 | 6";
    private String row4 = "- - - - -";
    private String row5 = "7 | 8 | 9";

    public Board(PrintStream printStream) {
        this.printStream = printStream;

        boardRows.add(row1);
        boardRows.add(row2);
        boardRows.add(row3);
        boardRows.add(row4);
        boardRows.add(row5);
    }


    public void displayBoard(){

        for(String row: boardRows){
            printStream.println(row);
        }
    }

}
