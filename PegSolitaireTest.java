import java.util.Arrays;

public class PegSolitaireTest
{
	
	public static void main(String[] args)
	{
		boolean[][] boardOne = new boolean[][]{
			{false,false,false,false,false,false,false},
			{false,false,false,true,false,false,false},
			{false,false,false,true,false,false,false},
			{false,true,true,true,true,true,false},
			{false,false,false,true,false,false,false},
			{false,false,false,true,false,false,false},
			{false,false,false,false,false,false,false}
		};
		
		boolean[][] boardTwo = new boolean[][]{
			{false,false,true,true,true,false,false},
			{false,false,true,true,true,false,false},
			{true,true,true,true,true,true,true},
			{true,true,true,false,true,true,true},
			{true,true,true,true,true,true,true},
			{false,false,true,true,true,false,false},
			{false,false,true,true,true,false,false}
		};
		
		boolean[][] boardThree = new boolean[][]{
			{false,false,false,true,false,false,false},
			{false,false,true,true,true,false,false},
			{false,true,true,true,true,true,false},
			{true,true,true,false,true,true,true},
			{false,true,true,true,true,true,false},
			{false,false,true,true,true,false,false},
			{false,false,false,true,false,false,false}
		};
			
		boolean[][] solvedBoard = new boolean[][]{
			{false,false,false,false,false,false,false},
			{false,false,false,false,false,false,false},
			{false,false,false,false,false,false,false},
			{false,false,false,true,false,false,false},
			{false,false,false,false,false,false,false},
			{false,false,false,false,false,false,false},
			{false,false,false,false,false,false,false}
		};
		
		PegSolitaire.print(boardOne);
		System.out.println(PegSolitaire.solve(boardOne));
		
	}
	
}