package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rei extends ChessPiece{

	public Rei(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
