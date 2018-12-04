package s11.chess.chess.pieces;

//a130 - Colocando peças no tabuleiro

import s11.chess.boardgame.Board;
import s11.chess.chess.ChessPiece;
import s11.chess.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
}
