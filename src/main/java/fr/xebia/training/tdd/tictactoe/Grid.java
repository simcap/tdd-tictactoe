package fr.xebia.training.tdd.tictactoe;

public class Grid {
	
	private int[][] grid;
	
	public Grid() {
		this.grid = new int[3][3];
	}

	public void setValue(int col, int row, int value) {
		grid[col][row] = value;
	}

	public int valueAt(int col, int row) {
		return grid[col][row];
	}
	
	public boolean invalidPosition(int col, int row) {
		return occupied(col,row) || defyingGravity(col,row);
	}

	public boolean defyingGravity(int col, int row) {
		return row > 0 && valueAt(col,row-1) == 0;
	}

	public boolean occupied(int col, int row) {
		return valueAt(col,row) != 0;
	}

	public boolean hasFullColumnOf(int value) {
		return ((valueAt(0,0) == value && valueAt(0,1) == value && valueAt(0,2) == value)
				|| (valueAt(1,0) == value  && valueAt(1,1) == value && valueAt(1,2) == value) 
				|| (valueAt(2,0) == value  && valueAt(2,1) == value && valueAt(2,2) == value));
	}
	
	public boolean hasFullRowOf(int value) {
		return ((valueAt(0,0) == value && valueAt(1,0) == value && valueAt(2,0) == value)
				|| (valueAt(0,1) == value  && valueAt(1,1) == value && valueAt(2,1) == value) 
				|| (valueAt(0,2) == value  && valueAt(1,2) == value && valueAt(2,2) == value));
	}  
	
	public boolean hasFullDiagonalOf(int value) {
		return ((valueAt(0,0) == value && valueAt(1,1) == value && valueAt(2,2) == value)
				|| (valueAt(0,2) == value  && valueAt(1,1) == value && valueAt(2,0) == value));
	}

	public boolean isFull() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if(valueAt(i, j) == 0){
					return false;
				}
			}
		}
		return true;
	};
	
}