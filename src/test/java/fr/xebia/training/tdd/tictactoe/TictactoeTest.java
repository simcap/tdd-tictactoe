package fr.xebia.training.tdd.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TictactoeTest {

	@Test
	public void should_return_minus_1_if_game_is_full () throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0,0,2));
		assertEquals(0, tictactoe.play(0,1,1));
		assertEquals(0, tictactoe.play(0,2,2));
		
		assertEquals(0, tictactoe.play(1,0,1));
		assertEquals(0, tictactoe.play(1,1,1));
		assertEquals(0, tictactoe.play(1,2,2));

		assertEquals(0, tictactoe.play(2,0,1));
		assertEquals(0, tictactoe.play(2,1,2));
		assertEquals(-1, tictactoe.play(2,2,1));
	}

	@Test
	public void should_return_minus_1_if_newly_put_token_has_no_token_below () throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(-1, tictactoe.play(1,1,1));
	}

	@Test
	public void player_1_return_minus_one_if_token_is_put_in_occupied_spot() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0,0,1));
		assertEquals(-1, tictactoe.play(0,0,1));
	}

	@Test
	public void player_2_return_minus_one_if_token_is_put_in_occupied_spot() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(2,0,2));
		assertEquals(-1, tictactoe.play(2,0,2));
	}

	@Test
	public void player1_column_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0,0,1));
		assertEquals(0, tictactoe.play(0,1,1));
		assertEquals(1, tictactoe.play(0,2,1));
	}
	
	@Test
	public void player1_middle_column_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(1,0, 1));
		assertEquals(0, tictactoe.play(1,1, 1));
		assertEquals(1, tictactoe.play(1,2, 1));
	}
	
	@Test
	public void player1_last_column_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(2,0, 1));
		assertEquals(0, tictactoe.play(2,1, 1));
		assertEquals(1, tictactoe.play(2,2, 1));
	}

	@Test
	public void player1_row_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0,0,1));
		assertEquals(0, tictactoe.play(1,0,1));
		assertEquals(1, tictactoe.play(2,0,1));
	}
	
	@Test
	public void player1_middle_row_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0, 0, 2));
		assertEquals(0, tictactoe.play(1, 0, 1));
		assertEquals(0, tictactoe.play(2, 0, 2));
		
		assertEquals(0, tictactoe.play(0,1,1));
		assertEquals(0, tictactoe.play(1,1,1));
		assertEquals(1, tictactoe.play(2,1,1));
	}
	
	@Test
	public void player1_last_row_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0, 0, 2));
		assertEquals(0, tictactoe.play(1, 0, 1));
		assertEquals(0, tictactoe.play(2, 0, 2));

		assertEquals(0, tictactoe.play(0, 1, 1));
		assertEquals(0, tictactoe.play(1, 1, 2));
		assertEquals(0, tictactoe.play(2, 1, 1));
		
		assertEquals(0, tictactoe.play(0,2,1));
		assertEquals(0, tictactoe.play(1,2,1));
		assertEquals(1, tictactoe.play(2,2,1));
	}

	@Test
	public void player1_first_diagonal_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(1, 0, 2));
		assertEquals(0, tictactoe.play(2, 0, 2));
		assertEquals(0, tictactoe.play(2, 1, 2));
		
		assertEquals(0, tictactoe.play(0,0,1));
		assertEquals(0, tictactoe.play(1,1,1));
		assertEquals(1, tictactoe.play(2,2,1));
	}

	@Test
	public void player1_second_diagonal_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0, 0, 2));
		assertEquals(0, tictactoe.play(0, 1, 2));
		assertEquals(0, tictactoe.play(1, 0, 2));
		
		assertEquals(0, tictactoe.play(0,2,1));
		assertEquals(0, tictactoe.play(1,1,1));
		assertEquals(1, tictactoe.play(2,0,1));
	}

	@Test
	public void player2_column_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0,0,2));
		assertEquals(0, tictactoe.play(0,1,2));
		assertEquals(1, tictactoe.play(0,2,2));
	}
	
	@Test
	public void player2_middle_column_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(1,0,2));
		assertEquals(0, tictactoe.play(1,1,2));
		assertEquals(1, tictactoe.play(1,2,2));
	}
	
	@Test
	public void player2_last_column_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(2,0,2));
		assertEquals(0, tictactoe.play(2,1,2));
		assertEquals(1, tictactoe.play(2,2,2));
	}
	
	@Test
	public void player2_row_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0,0,2));
		assertEquals(0, tictactoe.play(1,0,2));
		assertEquals(1, tictactoe.play(2,0,2));
	}
	
	@Test
	public void player2_middle_row_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0, 0, 2));
		assertEquals(0, tictactoe.play(1, 0, 1));
		assertEquals(0, tictactoe.play(2, 0, 2));
		
		assertEquals(0, tictactoe.play(0,1,2));
		assertEquals(0, tictactoe.play(1,1,2));
		assertEquals(1, tictactoe.play(2,1,2));
	}
	
	@Test
	public void player2_last_row_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0, 0, 1));
		assertEquals(0, tictactoe.play(1, 0, 1));
		assertEquals(0, tictactoe.play(2, 0, 2));

		assertEquals(0, tictactoe.play(0, 1, 2));
		assertEquals(0, tictactoe.play(1, 1, 1));
		assertEquals(0, tictactoe.play(2, 1, 1));
		
		assertEquals(0, tictactoe.play(0,2,2));
		assertEquals(0, tictactoe.play(1,2,2));
		assertEquals(1, tictactoe.play(2,2,2));
	}
	@Test
	public void player2_first_diagonal_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(1, 0, 1));
		assertEquals(0, tictactoe.play(2, 0, 1));
		assertEquals(0, tictactoe.play(2, 1, 1));
		
		assertEquals(0, tictactoe.play(0,0,2));
		assertEquals(0, tictactoe.play(1,1,2));
		assertEquals(1, tictactoe.play(2,2,2));
	}
	@Test
	public void player2_second_diagonal_of_3_items_should_win() throws Exception {
		Tictactoe tictactoe = new Tictactoe();
		assertEquals(0, tictactoe.play(0, 0, 1));
		assertEquals(0, tictactoe.play(0, 1, 1));
		assertEquals(0, tictactoe.play(1, 0, 1));
		
		assertEquals(0, tictactoe.play(0,2,2));
		assertEquals(0, tictactoe.play(1,1,2));
		assertEquals(1, tictactoe.play(2,0,2));
	}
}
