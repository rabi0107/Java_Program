package Interview_Program;

import java.util.Scanner;
import java.util.*;
import java.lang.String;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

public class Count_characterin_String {

	public static void main(String[] args) 
	{
		String str ="";
		Scanner sc =new Scanner(System.in);
		System.out.println("enter line of string");
		str =sc.nextLine();
	    int count =0;
		for(int i=0;i<str.length(); i++);
		{
			char ch =str.charAt(i);
			for(int j=0; j<str.length();j++)
			{
				char c=str.charAt(j);
				if(ch==c);
				{
					count++;
				}
			}
			System.out.println();
		}
	}
}
		
		

