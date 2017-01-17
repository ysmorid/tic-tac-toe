import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ymoridza on 1/13/17.
 */
public class Board {
    private PrintStream printStream;
    private List<String> boardSpots;
    private BufferedReader bufferedReader;
    private int playerSelection;

    public Board(PrintStream printStream, List<String> boardSpots, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.boardSpots = boardSpots;
        this.bufferedReader = bufferedReader;
        initializeBoardSpots();
    }

    private void initializeBoardSpots(){
        boardSpots = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
    }

    public void createsAndDisplaysBoard(){
        String board = String.format(
                "%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s", boardSpots.get(0),boardSpots.get(1),boardSpots.get(2),boardSpots.get(3),boardSpots.get(4),
                boardSpots.get(5),boardSpots.get(6),boardSpots.get(7),boardSpots.get(8));

        printStream.println(board);
    }

    public void replaceBoardSpotWithUserChoice(int userTurn) throws IOException {
        if(userTurn == 1){
            boardSpots.set(playerSelection, "X");
        }
        else if(userTurn == 2){
            boardSpots.set(playerSelection, "O");
        }
        createsAndDisplaysBoard();
    }

    private int receivePlayerChoice() throws IOException {
        String playerChoice = bufferedReader.readLine();
        int playerChoicetoIndex = Integer.parseInt(playerChoice);
        return playerChoicetoIndex;
    }

    public boolean checkIfLocationTaken() throws IOException {
        playerSelection = receivePlayerChoice() - 1;
        if(boardSpots.get(playerSelection) == "X" || boardSpots.get(playerSelection) == "O"){
            printStream.println("Location already taken. Please choose again.");
            return true;
        }
        else{
            return false;
        }
    }
}
