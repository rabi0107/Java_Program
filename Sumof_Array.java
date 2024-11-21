//Sum of array
package Interview_Program;

public class Sumof_Array {

	public static void main(String[] args)
	{
		int a[] = {5,2,7,9,7}; // n-5  n-1 =4
		int sum =0;
		for(int i=0; i<a.length-1; i++)
		{
			sum =sum+a[i];
			System.out.println("sum of array :"+sum);
		}

	}

}
