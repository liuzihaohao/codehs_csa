public class RowvColumn
{
	public static void main(String[] args)
	{
		/**This program compares the run-time between row-major and column major
		 * ordering.
		 */

		//creating a 2d Array
		int[][] twoD = new int[5000][5000];


		long start = System.currentTimeMillis();
		for (int row = 0 ; row < twoD.length; row++)
		{
			for (int col = 0; col < twoD[row].length; col++)
			{
				twoD[row][col] = row + col;
			}
		}
		
		long mid = System.currentTimeMillis();
		
		for (int row = 0; row < twoD[0].length; row++)
		{
			for (int col = 0; col < twoD.length; col++)
			{
				twoD[col][row] = row + col;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Speed to traverse Row-Major (Milliseconds): " + (mid - start));
		System.out.println("Speed to traverse Column-Major (Milliseconds): " + (end-mid));
		
	}
}