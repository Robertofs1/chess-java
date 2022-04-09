package BoardGame;

public class piece {
    protected Position position;
    private Board board;

    public piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
