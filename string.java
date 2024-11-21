package Interview_Program;

public class string {

	public static void main(String[] args) 
	{
		String arr[] = {"java", "c", "hh", "c" ,"java"};
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("found dulpicate number "+ arr[i]);
				}
			}
		}

	}

}
