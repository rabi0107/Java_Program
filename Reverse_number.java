// WAP Reverse Number
package Interview_Program;

public class Reverse_number {

	public static void main(String[] args) 
	{
		int no =5432;
		int rem; int rev=0;
		while(no !=0)
		{
			rem =no%10;
			rev =rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);

	}

}
