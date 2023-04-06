
import java.util.*;

public class checkForVowelAndCons {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any line if string");
		str=sc.nextLine();
		str = str.toLowerCase();
		int v=0, c=0,special=0;
		char ch = 0;
		for (int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);
		
			if((ch >= 'A'&& ch<='Z' || ch>='a' && ch<='z')){
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}
			
				else  {c++;}}	
			
						
		else {
			special++;}
		}
		
		System.out.println("Total Number of Vowel "+v);
		System.out.println("Total Number of Consonents "+c);
		System.out.println("Total Number of Special Characterts "+special);
		
	}
	}
