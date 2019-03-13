import java.util.ArrayList;

public class CheckersTest {

	public static void main(String[] args) {
		
		int[][] board = new int[][]{
			{0,-1,0,-1,0,-1,0,-1},
			{-1,0,-1,0,-1,0,-1,0},
			{0,-1,0,-1,0,-1,0,-1},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0}
		};
		
		int[][] board2 = new int[][]{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,-1,0,-1,0},
			{0,-1,0,-1,0,-1,0,-1},
			{-1,0,-1,0,-1,0,1,0},
			{0,1,0,0,0,0,0,-1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,0,0,0,0,0},
			{0,0,0,0,1,0,1,0}
		};
		
		
		
		Checkers test = new Checkers(board2);
		
		System.out.println("Original Board:");
		test.printBoard();
		System.out.println("----------------------------------");
		
		int[][] tempBoard = test.getBestMove(test.board, false, 4).makeMove(test.board);
		test.printBoard(tempBoard);
		
		

	}

}
