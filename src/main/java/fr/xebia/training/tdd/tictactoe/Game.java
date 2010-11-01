package fr.xebia.training.tdd.tictactoe;

public class Game {
	
	private int[][] grid = new int[3][3];

	public int put(int i, int j, int player) {
		grid[i][j] = player;
		if(hasColumn(player) == 1 || hasRow(player) == 1 || hasDiagonal(player) == 1){
			return 1;
		} else return 0;
	}

	private int hasColumn(int player) {
		if((grid[0][0] == player && grid[0][1] == player && grid[0][2] == player)
				|| (grid[1][0] == player  && grid[1][1] == player && grid[1][2] == player) 
				|| (grid[2][0] == player  && grid[2][1] == player && grid[2][2] == player)){
			return 1;
		} else return 0;
	}                                                   
	private int hasRow(int player) {
		if ((grid[0][0] == player && grid[1][0] == player && grid[2][0] == player)
				|| (grid[0][1] == player  && grid[1][1] == player && grid[2][1] == player) 
				|| (grid[0][2] == player  && grid[1][2] == player && grid[2][2] == player)){
			return 1;
		} return 0;
	}                                                   
	private int hasDiagonal(int player) {
		if((grid[0][0] == player && grid[1][1] == player && grid[2][2] == player)
				|| (grid[0][2] == player  && grid[1][1] == player && grid[2][0] == player)){
			return 1;
		} else return 0;
	}
}
