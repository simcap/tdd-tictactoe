package fr.xebia.training.tdd.tictactoe;

public class Game {
	
	private int[][] grid = new int[3][3];

	public boolean put(int i, int j, int player) {
		grid[i][j] = player;
		return playerOneHasColumn() || playerTwoHasColumn() ||
			   playerOneHasRow() || playerTwoHasRow() ||
			   playerOneHasDiagonal() || playerTwoHasDiagonal();                                          
	}

	private boolean playerOneHasColumn() {
		return (grid[0][0] == 1 && grid[0][1] == 1 && grid[0][2] == 1)
		 	|| (grid[1][0] == 1  && grid[1][1] == 1 && grid[1][2] == 1) 
            || (grid[2][0] == 1  && grid[2][1] == 1 && grid[2][2] == 1);
	}                                                   
	private boolean playerOneHasRow() {
		return (grid[0][0] == 1 && grid[1][0] == 1 && grid[2][0] == 1)
		|| (grid[0][1] == 1  && grid[1][1] == 1 && grid[2][1] == 1) 
		|| (grid[0][2] == 1  && grid[1][2] == 1 && grid[2][2] == 1);
	}                                                   
	private boolean playerOneHasDiagonal() {
		return (grid[0][0] == 1 && grid[1][1] == 1 && grid[2][2] == 1)
		|| (grid[0][2] == 1  && grid[1][1] == 1 && grid[2][0] == 1); 
	}                                                   
	private boolean playerTwoHasColumn() {
		return (grid[0][0] == 2 && grid[0][1] == 2 && grid[0][2] == 2)
			|| (grid[1][0] == 2  && grid[1][1] == 2 && grid[1][2] == 2) 
			|| (grid[2][0] == 2  && grid[2][1] == 2 && grid[2][2] == 2);
	}
	private boolean playerTwoHasRow() {
		return (grid[0][0] == 2 && grid[1][0] == 2 && grid[2][0] == 2)
		|| (grid[0][1] == 2  && grid[1][1] == 2 && grid[2][1] == 2) 
		|| (grid[0][2] == 2  && grid[1][2] == 2 && grid[2][2] == 2);
	} 
	private boolean playerTwoHasDiagonal() {
		return (grid[0][0] == 2 && grid[1][1] == 2 && grid[2][2] == 2)
		|| (grid[0][2] == 2  && grid[1][1] == 2 && grid[2][0] == 2); 
	} 

}
