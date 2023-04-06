
import java.util.Scanner;

public class MaxCharacter {

	public static void main(String[] args) {
		
		String str="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter line of string");
		str=sc.nextLine();
		char string[]= str.toCharArray();
		int [] freq=new int [str.length()];
		int i, j;
		char maxchar=string[0];
		for (i=0; i<string.length; i++) 
		{
			freq[i]=1;
			for (j=i+1;j<string.length; j++)
			{
				if(string [i]==string[j]&& string[i]!=' ')
				{
					freq[i]++;
				}
			}
			
		}
	
		int max = freq[0];
		for (i=0;i<freq.length;i++)
		{
			if (max<freq[i]) {
				max=freq[i];
				maxchar=string[i];
			}
		}
		System.out.println("Maximum repeated character = "+maxchar+"  Number of times ="+max);
	
	}

}
