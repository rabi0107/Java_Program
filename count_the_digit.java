package Interview_Program;

import java.util.Scanner;

public class count_the_digit {

	public static void main(String[] args) 
	{
		int n; int count=0;
		System.out.println("please enter number");
		Scanner r =new Scanner(System.in);
		n=r.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("no of digit :"+count);
		

	}

}