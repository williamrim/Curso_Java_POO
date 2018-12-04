package s11.chess.chess.pieces;

import s11.chess.boardgame.Board;
import s11.chess.chess.ChessPiece;
import s11.chess.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
}
