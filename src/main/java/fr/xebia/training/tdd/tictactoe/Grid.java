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
	}
}