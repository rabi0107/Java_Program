package Interview_Program;

public class Star_Pattern1 {

	public static void main(String[] args) 
	{
		/*for(int i=1; i<=4; i++) // Pattern one
		{
			for(int j=1; j<=i; j++)
			{
				System.out.println("*");
			}
			System.out.println();*/
		
		for(int i=1; i<=4; i++) //Another pattern 2
		{
			for(int j=4; j>=i; j--)
			{
				System.out.println("*");
			}
			System.out.println();
		}

	}

}

