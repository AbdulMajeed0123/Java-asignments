
public class Palindrome {

	public static void main(String[] args) {
		
		String s1="2552";
		String s2="";
		
		for (int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);                                
		
		
		if(s1.contentEquals(s2))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	
	}
	

}
