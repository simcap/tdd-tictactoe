package fr.xebia.training.tdd.tictactoe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TicTacToeGameTest {
	
	@Test
	public void player1_column_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,0,1));
		assertFalse(game.put(0,1,1));
		assertTrue(game.put(0,2,1));
	}
	
	@Test
	public void player1_middle_column_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(1,0, 1));
		assertFalse(game.put(1,1, 1));
		assertTrue(game.put(1,2, 1));
	}
	
	@Test
	public void player1_last_column_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(2,0, 1));
		assertFalse(game.put(2,1, 1));
		assertTrue(game.put(2,2, 1));
	}

	@Test
	public void player1_row_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,0,1));
		assertFalse(game.put(1,0,1));
		assertTrue(game.put(2,0,1));
	}
	
	@Test
	public void player1_middle_row_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,1,1));
		assertFalse(game.put(1,1,1));
		assertTrue(game.put(2,1,1));
	}
	
	@Test
	public void player1_last_row_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,2,1));
		assertFalse(game.put(1,2,1));
		assertTrue(game.put(2,2,1));
	}

	@Test
	public void player1_first_diagonal_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,0,1));
		assertFalse(game.put(1,1,1));
		assertTrue(game.put(2,2,1));
	}

	@Test
	public void player1_second_diagonal_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,2,1));
		assertFalse(game.put(1,1,1));
		assertTrue(game.put(2,0,1));
	}

	@Test
	public void player2_column_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,0,2));
		assertFalse(game.put(0,1,2));
		assertTrue(game.put(0,2,2));
	}
	
	@Test
	public void player2_middle_column_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(1,0,2));
		assertFalse(game.put(1,1,2));
		assertTrue(game.put(1,2,2));
	}
	
	@Test
	public void player2_last_column_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(2,0,2));
		assertFalse(game.put(2,1,2));
		assertTrue(game.put(2,2,2));
	}
	
	@Test
	public void player2_row_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,0,2));
		assertFalse(game.put(1,0,2));
		assertTrue(game.put(2,0,2));
	}
	
	@Test
	public void player2_middle_row_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,1,2));
		assertFalse(game.put(1,1,2));
		assertTrue(game.put(2,1,2));
	}
	
	@Test
	public void player2_last_row_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,2,2));
		assertFalse(game.put(1,2,2));
		assertTrue(game.put(2,2,2));
	}
	@Test
	public void player2_first_diagonal_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,0,2));
		assertFalse(game.put(1,1,2));
		assertTrue(game.put(2,2,2));
	}
	@Test
	public void player2_second_diagonal_of_3_items_should_win() throws Exception {
		Game game = new Game();
		assertFalse(game.put(0,2,2));
		assertFalse(game.put(1,1,2));
		assertTrue(game.put(2,0,2));
	}
}
