package Interview_Program;

public class p11 {

	public static void main(String[] args) 
	{
		int no =11;
		int temp=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%2==0)
			{
				temp=temp+1;
				
			}
			
		}
		if(temp==0)
		{
			System.out.println(no+" is prime no");
		}
		else
		{
			System.out.println(no+" is no prime no");
		}
		

	}

}
