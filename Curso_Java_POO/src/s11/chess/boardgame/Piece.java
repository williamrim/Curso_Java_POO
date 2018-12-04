package s11.chess.boardgame;

//a130 - Colocando peças no tabuleiro

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
