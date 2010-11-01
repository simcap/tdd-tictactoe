package fr.xebia.training.tdd.tictactoe;

public class Grid {
	
	private int[][] grid;
	
	public Grid() {
		this.grid = new int[3][3];
	}

	public void setValue(int x, int y, int value) {
		grid[x][y] = value;
	}

	public int getValue(int x, int y) {
		return grid[x][y];
	}
	
	public boolean invalidPosition(int col, int row) {
		return occupied(col,row) || defyingGravity(col,row);
	}

	public boolean defyingGravity(int col, int row) {
		return row > 0 && getValue(col,row-1) == 0;
	}

	public boolean occupied(int col, int row) {
		return getValue(col,row) != 0;
	}

	public boolean hasFullColumnOf(int value) {
		return ((getValue(0,0) == value && getValue(0,1) == value && getValue(0,2) == value)
				|| (getValue(1,0) == value  && getValue(1,1) == value && getValue(1,2) == value) 
				|| (getValue(2,0) == value  && getValue(2,1) == value && getValue(2,2) == value));
	}
	
	public boolean hasFullRowOf(int value) {
		return ((getValue(0,0) == value && getValue(1,0) == value && getValue(2,0) == value)
				|| (getValue(0,1) == value  && getValue(1,1) == value && getValue(2,1) == value) 
				|| (getValue(0,2) == value  && getValue(1,2) == value && getValue(2,2) == value));
	}  
	
	public boolean hasFullDiagonalOf(int value) {
		return ((getValue(0,0) == value && getValue(1,1) == value && getValue(2,2) == value)
				|| (getValue(0,2) == value  && getValue(1,1) == value && getValue(2,0) == value));
	};
}