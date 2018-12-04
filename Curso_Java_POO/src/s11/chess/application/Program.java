package s11.chess.application;

import s11.chess.boardgame.Board;
import s11.chess.boardgame.Position;
import s11.chess.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
