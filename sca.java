package Interview_Program;

import java.util.Scanner;


public class sca 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter your name");
		String name =s.next();
		System.out.println("enter gen");
		char Gen =s.next().charAt(0);
		System.out.println("enter age");
		int agee =s.nextInt();
		System.out.println("enter phone number");
		long phonenumber =s.nextLong();
		System.out.println(name);
		System.out.println(Gen);

	}

}
