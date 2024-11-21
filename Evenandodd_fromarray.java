//Wap Even and odd from array
package Interview_Program;

public class Evenandodd_fromarray {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		for(int i=0; i<a.length;i++) //6
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]); //if(a[i]%2!==0) //odd number
			}
			
		}

	}

}
