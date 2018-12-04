package s11.chess.chess;

//a129 - Camada chess e imprimindo o tabuleiro

import s11.chess.boardgame.Board;
import s11.chess.boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
