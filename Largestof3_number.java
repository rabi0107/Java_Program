// WAP Largest of 3 number
package Interview_Program;

public class Largestof3_number 
{

	public static void main(String[] args) 
	{
		int a =100; int b=15; int c=20;
		if(a>b &a>c)
		{
			System.out.println("largest number is :"+ a);
		}
		else if(b>a & b>c)
		{
			System.out.println("largest number is :"+ b);
		}
		else
		{
			System.out.println("largest number is :"+ c);
		}

	}

}
