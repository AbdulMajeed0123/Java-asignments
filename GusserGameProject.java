

import java.util.Scanner;

public class GusserGameProject{
	
	
	public static void gussingNumberGame()
	{
		Scanner sc = new  Scanner(System.in);
		int number = 1 + (int)(100*Math.random());
		int k = 10; 
		int i, guess; 
		System.out.println("A number is chosen"+ "between 1 to 100." + "Guess the number" + "withing 10 trials.");
		
	
		for ( i = 0; i<k; i++)
		 	{
				System.out.println("Guess the number:");
				
				guess=sc.nextInt();
				
				if (number == guess)
				{
					System.out.println("Congratulation!" + "You have guessed the number.");
					break;
					
				}
				else if (number > guess && i!=k-1)
				{
					System.out.println(" The number is " + " greater than" + guess);
					
				}
				else if (number < guess && i!=k-1)
				{
					System.out.println(" The number is " + " less than" + guess);
					
				
		 	}
	}
		
	if (i==k) {
		
		System.out.println("You have exhausted"+ " K trials.");
		System.out.println("The number was " + number);
	}
		
		
}
	

	public static void main(String[] args) {
		gussingNumberGame();
		
	}

}
