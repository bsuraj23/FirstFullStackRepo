public class StarPattern{
	public static void StarPyramid(int n) {
		for (int i = 1; i <=n; i++) // outer loop for number of rows(n)
		{

			for (int j = 1; j <= n-i; j++) // inner loop for spaces
			{
				System.out.print(" "); // print space
			}
			for (int r = 1; r <= i; r++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}

			System.out.println(); // ending line after each row
		}
	}

	public static void main(String args[]) // driver function
	{
		int n = 6;
		StarPyramid(n);
	}
}