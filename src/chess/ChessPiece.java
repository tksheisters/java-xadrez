package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {
	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color, int moveCount) {
		super(board);
		this.color = color;
		this.moveCount = moveCount;
	}

	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
	
	
}
