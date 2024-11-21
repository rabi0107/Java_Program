//WAP Duplicate element in array
package Interview_Program;

public class Duplicate_Element {

	public static void main(String[] args) 
	{
		String arr []= {"java", "c","c++", "Python","java", "c"};
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.println("Found Duplicate Element : "+arr[i]);
				}
			}
		}
		

	}

}
