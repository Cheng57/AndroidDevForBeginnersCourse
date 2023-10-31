import java.util.*;

public class GuessingGame{
	public static void main(String[] args){
		System.out.println("Welcome to GuessANum world!");

		//only create a single 'Scanner' object and reuse it.
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name:");
		String userName = scanner.nextLine();
		System.out.println("Hello " + userName);

		String yesOrNo = "n";

		//use equals method to compare the contents of the strings instead of "=="
		//because '==' checks for reference equality, not content equality.
		while (!yesOrNo.equals("y")){
			System.out.println("Are you ready? y/n");
			yesOrNo = scanner.nextLine().toLowerCase();
			if (!yesOrNo.equals("n") && !yesOrNo.equals("y")){
				System.out.println("Invalid input");
			}
		}
		if (yesOrNo.equals("y")){
			Random rand = new Random();
			int randNum = rand.nextInt(10) + 1;
			//System.out.println("The random number is " + randNum);

			int counter = 0;
			int userNum = 0;
			while (counter < 5){
				counter++;

				System.out.println("Please enter a number between 1 and 10:");
				userNum = scanner.nextInt();

				if (userNum > randNum && counter < 5){
					System.out.println("Guess a lower number");
				}

				if(userNum < randNum && counter < 5){
					System.out.println("Guess a higher number");
				}

				if (userNum == randNum){
					//System.out.println("Congrats! You got it in " + counter + " guess.");
					break;
				}
			}

			if (counter <= 5 && userNum == randNum){
				System.out.println("Congrats! You got it in " + counter + " guess.");
			}
			else{
				System.out.println("Game Over");
				System.out.println("The number was " + randNum);
			}
		}
		//close the Scanner when finished (optional but good practice).
		scanner.close();
	}
}