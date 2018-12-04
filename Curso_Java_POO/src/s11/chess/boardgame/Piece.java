package s11.chess.boardgame;

//a129 - Camada chess e imprimindo o tabuleiro

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
