package boardgame;

public class Position {
	 private int row;
	 private int column;
//	 private Piece[][] pieces;
	 
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	//	pieces = new Piece[rows][columns];
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumns() {
		return column;
	}

	public void setColumns(int column) {
		this.column = column;
	}
//	
//	public Piece piece(int row, int columns) {
//		this.columns[row][column];
//	}
//	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	 
	 
}
