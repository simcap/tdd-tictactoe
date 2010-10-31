package fr.xebia.training.tdd.tictactoe;

public class Game {
	
	private int[][] grids = new int[3][3];

	public boolean put(int i, int j, int player) {
		grids[i][j] = player;
		return playerOneHasColumn() || playerTwoHasColumn() ||
			   playerOneHasRow() || playerTwoHasRow() ||
			   playerOneHasDiagonal() || playerTwoHasDiagonal();                                          
	}

	private boolean playerOneHasColumn() {
		return (grids[0][0] == 1 && grids[0][1] == 1 && grids[0][2] == 1)
		 	|| (grids[1][0] == 1  && grids[1][1] == 1 && grids[1][2] == 1) 
            || (grids[2][0] == 1  && grids[2][1] == 1 && grids[2][2] == 1);
	}                                                   
	private boolean playerOneHasRow() {
		return (grids[0][0] == 1 && grids[1][0] == 1 && grids[2][0] == 1)
		|| (grids[0][1] == 1  && grids[1][1] == 1 && grids[2][1] == 1) 
		|| (grids[0][2] == 1  && grids[1][2] == 1 && grids[2][2] == 1);
	}                                                   
	private boolean playerOneHasDiagonal() {
		return (grids[0][0] == 1 && grids[1][1] == 1 && grids[2][2] == 1)
		|| (grids[0][2] == 1  && grids[1][1] == 1 && grids[2][0] == 1); 
	}                                                   
	private boolean playerTwoHasColumn() {
		return (grids[0][0] == 2 && grids[0][1] == 2 && grids[0][2] == 2)
			|| (grids[1][0] == 2  && grids[1][1] == 2 && grids[1][2] == 2) 
			|| (grids[2][0] == 2  && grids[2][1] == 2 && grids[2][2] == 2);
	}
	private boolean playerTwoHasRow() {
		return (grids[0][0] == 2 && grids[1][0] == 2 && grids[2][0] == 2)
		|| (grids[0][1] == 2  && grids[1][1] == 2 && grids[2][1] == 2) 
		|| (grids[0][2] == 2  && grids[1][2] == 2 && grids[2][2] == 2);
	} 
	private boolean playerTwoHasDiagonal() {
		return (grids[0][0] == 1 && grids[1][1] == 1 && grids[2][2] == 1)
		|| (grids[0][2] == 1  && grids[1][1] == 1 && grids[2][0] == 1); 
	} 

}
