package fr.xebia.training.tdd.tictactoe;

public class Tictactoe {
	
	private Grid grid = new Grid();

	public int put(int col, int row, int player) {
		if(occupied(col, row) || defyingGravity(col, row)){
			return -1;
		}
		
		grid.setValue(col, row, player);
		
		if(win(player)){
			return 1;
		} else return 0;
	}

	private boolean win(int player) {
		return grid.hasFullColumnOf(player) || grid.hasFullRowOf(player) || grid.hasFullDiagonalOf(player);
	}

	private boolean defyingGravity(int col, int row) {
		return row > 0 && grid.getValue(col,row-1) == 0;
	}

	private boolean occupied(int col, int row) {
		return grid.getValue(col,row) != 0;
	}
}
