package Interview_Program;

public class Min_element
{

	public static void main(String[] args) 
	{
		int a[]= {20,30,10, 50,70};
		int min =a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Miniumm number is :" + min);
		

	}

}
