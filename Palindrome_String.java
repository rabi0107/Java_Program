// Palindrome String

package Interview_Program;

public class Palindrome_String {

	public static void main(String[] args) 
	{
		String s ="madam";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev =rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}

	}

}
