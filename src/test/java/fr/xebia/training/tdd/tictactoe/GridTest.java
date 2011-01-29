package fr.xebia.training.tdd.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GridTest {
	
	@Test
	public void should_set_and_get_value_in_grid() throws Exception {
		Grid grid = new Grid();
		grid.setValue(2, 2, 10);
		assertEquals(10, grid.valueAt(2, 2));
	}
}
