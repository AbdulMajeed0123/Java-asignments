import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 ="java";
		String s2 ="avaj";
		if(anagramCheck(s1,s2))
		{
			System.out.println(s1+ " and "+s2+ " are Anagrams");
		}
		else
		{
			System.out.println(s1+ " and "+s2+ " are not anagrams");
		}
			}

	public static boolean anagramCheck(String s1, String s2)
	{
		if (s1.length()!=s2.length())
		{
			return false;
		}
		else 
		{
			char ch1 []=s1.toCharArray();
			char ch2 []=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		
	
	if (Arrays.equals(ch1,ch2))
	{ 
		return true;
	}
	else {
		return false;
	}
	}
	
	}}
