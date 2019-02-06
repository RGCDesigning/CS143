import java.util.Arrays;

public class PegSolitaire {
	
	public static String solve(boolean[][] board)
	{
		
		if(checkSolved(board))
			return "Solved!";
		
		boolean[][] last = new boolean[7][7];
		last = board.clone();
		
		
		for(int x = 0; x < 7; x++)
		{
			for(int y = 0; y < 7; y++)
			{
								
				String move;
				
				//Move From Below
				move = tryMove(board, x, y+2, x, y+1, x, y);
				if(move != null)
				{
					String nextMove = solve(board);
					if(nextMove == null)
					{
						//Backtrack
						board = last;
					}
					else
					{
						return move + nextMove;
					}
				}
				
				move = tryMove(board, x, y-2, x, y-1, x, y);
				if(move != null)
				{
					String nextMove = solve(board);
					if(nextMove == null)
					{
						//Backtrack
						board = last;
					}
					else
					{
						return move + nextMove;
					}
				}
				
				move = tryMove(board, x, y, x+1, y, x+2, y);
				if(move != null)
				{
					String nextMove = solve(board);
					if(nextMove == null)
					{
						//Backtrack
						board = last;
					}
					else
					{
						return move + nextMove;
					}
				}
				
				move = tryMove(board, x, y, x-1, y, x-2, y);
				if(move != null)
				{
					String nextMove = solve(board);
					if(nextMove == null)
					{
						//Backtrack
						board = last;
					}
					else
					{
						return move + nextMove;
					}
				}
			}
		}
		
		return null;
	}
	
	public static String tryMove(boolean[][] board, int startX, int startY, int jumpX, int jumpY, int endX, int endY)
	{
		if(startX < 0 || startX > 6 || startY < 0 || startY > 6)
			return null;
		if(jumpX < 0 || jumpX > 6 || jumpY < 0 || jumpY > 6)
			return null;
		if(endX < 0 || endX > 6 || endY < 0 || endY > 6)
			return null;
		
		if(board[startX][startY] == false || board[jumpX][jumpY] == false || board[endX][endY] == true)
			return null;
		
		board[startX][startY] = false;
		board[jumpX][jumpY] = false;
		board[endX][endY] = true;
		
		print(board);
		return "";
	}
	
	public static boolean checkSolved(boolean[][] board)
	{
		
		for(int x = 0; x < 7; x++)
		{
			for(int y = 0; y < 7; y++)
			{
				if(x == 3 && y == 3)
					continue;
				if(board[x][y])
					return false;
			}
		}
		
		return true;
		
	}
	
	public static void print(boolean[][] board)
	{
		for(int y = 0; y < 7; y++)
		{
			
			System.out.print("Row " + (y+1) + ": ");
			
			for(int x = 0; x < 7; x++)
			{
				
				if((x < 2 && y < 2) || (x > 4 && y < 2) || (x < 2 && y > 4) || (x > 4 && y > 4))
				{
					System.out.print("   ");
					continue;
				}
				
				if(board[x][y])
					System.out.print("x");
				else
					System.out.print("o");
				System.out.print("  ");
				
			}
			
			System.out.println("");
			
		}
		
		System.out.println();
	}
	
}
