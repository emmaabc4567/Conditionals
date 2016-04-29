import java.util.Scanner;

public class conditionals {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = userInput.nextInt();
		if (age < 5)
		{
			System.out.println("You are so young!");
		}
		else if (age > 18) 
		{
			System.out.println("How does it feel to be an adult now?");
		}
		else
		{
			System.out.println("School is amazing isn't it?");
		}
		Scanner userInput2 = new Scanner(System.in); 		
		System.out.println("What's your favorit type of pet?");
		System.out.println("Please type the number next to the best choice.");
		System.out.println(" (1) dog");
		System.out.println(" (2) cat");
		System.out.println(" (3) bird");
		System.out.println(" (4) fish");
		System.out.println(" (5) horse");
		int choice = userInput2.nextInt();
		
		if (choice == 1)
		{
			System.out.println("Doggies!");
		}
		else if (choice == 2)
		{
			System.out.println("I'm allergic to those.");
		}
		else if (choice == 3)
		{
			System.out.println("Birds are scary.");
		}
		else if (choice == 4)
		{ 
			System.out.println("Fish? Really?");
		}
		else
		{
			System.out.println("Are you a rider?");
		}
		Scanner userInput4 = new Scanner(System.in);
		System.out.println("Shall we play a game?");
		System.out.println("Guess what number I'm thinking of. It is between 1 and 25. You have 3 guesses.");
		int randomNumber = (int) (Math.random()*25)+1;
		int numberchoice = userInput4.nextInt();
		if (numberchoice > 16)
		{
			System.out.println("Too high, guess again.");
		}
		else if (numberchoice < 16)
		{
			System.out.println("Too low, guess again.");
		}
		else
		{
			System.out.println("Correct! You are a good guesser!");
			System.out.println("Goodbye, it was nice playing with you.");
		}
	}

}
