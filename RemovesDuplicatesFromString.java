

public class RemovesDuplicatesFromString {

	public static void main(String[] args) {
		
		String str = "ababdababbdbadbabad";
		System.out.println("Old string is : "+str);
		System.out.println("New String Is : "+removeDupliChar(str));
	}

	
	public static String removeDupliChar(String str)
	{
		String newStr="";
		
		for( int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if (newStr.indexOf(ch)==-1)
			{
				newStr+=ch;
				
			}
					
		}
			return newStr;
	}
}
