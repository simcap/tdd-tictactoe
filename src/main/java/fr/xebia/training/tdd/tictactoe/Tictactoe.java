package fr.xebia.training.tdd.tictactoe;

public class Tictactoe {
	
	private Grid grid = new Grid();

	public int play(int col, int row, int player) {
		if(grid.invalidPosition(col,row)){
			return -1;
		}
		
		grid.setValue(col, row, player);

		if(win(player)){
			return 1;
		} else if(grid.isFull()){
			return -1;
		} else return 0;
	}

	private boolean win(int player) {
		return grid.hasFullColumnOf(player) 
				|| grid.hasFullRowOf(player) 
				|| grid.hasFullDiagonalOf(player);
	}
	
}
