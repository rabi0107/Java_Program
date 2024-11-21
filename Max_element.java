package Interview_Program;

public class Max_element 
{

	public static void main(String[] args) 
	{
		int a[]= {80,20,70,50,20};
		int max =a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element is : "+max);
				

	}

}
