package single_responsibility.good;

public class BoardPresenter {
    private Board board;

    public BoardPresenter(Board board) {
        this.board = board;
    }

    public void displayBoard() {
        StringBuilder formattedBoard = new StringBuilder();
        final int boardSize = board.getSize()*board.getSize();

        for (int i = 0; i < boardSize; i++) {
            String borderOrNewline = "";

            borderOrNewline += (i + 1) % board.getSize() == 0 ? "\n" : "|";

            formattedBoard.append(board.getSpots().get(i))
                          .append(borderOrNewline);
        }

        System.out.print(formattedBoard);
    }
}
