package fr.xebia.training.tdd.tictactoe;

public class Game {
	
	private int[][] grid = new int[3][3];

	public boolean put(int i, int j, int player) {
		grid[i][j] = player;
		return hasColumn(1) || hasColumn(2) ||
			   hasRow(1) || hasRow(2) ||
			   hasDiagonal(1) || hasDiagonal(2);                                          
	}

	private boolean hasColumn(int player) {
		return (grid[0][0] == player && grid[0][1] == player && grid[0][2] == player)
		 	|| (grid[1][0] == player  && grid[1][1] == player && grid[1][2] == player) 
            || (grid[2][0] == player  && grid[2][1] == player && grid[2][2] == player);
	}                                                   
	private boolean hasRow(int player) {
		return (grid[0][0] == player && grid[1][0] == player && grid[2][0] == player)
		|| (grid[0][1] == player  && grid[1][1] == player && grid[2][1] == player) 
		|| (grid[0][2] == player  && grid[1][2] == player && grid[2][2] == player);
	}                                                   
	private boolean hasDiagonal(int player) {
		return (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player)
		|| (grid[0][2] == player  && grid[1][1] == player && grid[2][0] == player); 
	}
}
